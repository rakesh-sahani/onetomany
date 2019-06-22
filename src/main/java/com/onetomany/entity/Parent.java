/**
 * 
 */
package com.onetomany.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author sumit
 *
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Parent {

	@Id
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy="parent",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Child> child;

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(int id, String name, List<Child> child) {
		super();
		this.id = id;
		this.name = name;
		this.child = child;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Child> getChild() {
		return child;
	}

	public void setChild(List<Child> child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "Parent [id=" + id + ", name=" + name + ", child=" + child + "]";
	}
	
	
	
	
}
