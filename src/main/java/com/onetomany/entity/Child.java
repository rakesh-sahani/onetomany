/**
 * 
 */
package com.onetomany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.ForeignKey;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author sumit
 *
 */

@Entity
//@JsonIgnoreProperties(ignoreUnknown=true)
public class Child {

	@Id
	private int id;
	
	private String name;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JsonIgnore		
	private Parent parent;
	
	@JoinColumn(name="child_id")
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<SubChild> subChild = new ArrayList<>();

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(int id, String name, Parent parent, List<SubChild> subChild) {
		super();
		this.id = id;
		this.name = name;
		this.parent = parent;
		this.subChild = subChild;
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

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public List<SubChild> getSubChild() {
		return subChild;
	}

	public void setSubChild(List<SubChild> subChild) {
		this.subChild = subChild;
	}
	
	
}
