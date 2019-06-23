/**
 * 
 */
package com.onetomany.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author sumit
 *
 */
@Entity
//@JsonIgnoreProperties(ignoreUnknown=true)
public class SubChild {

	@Id
	private int id;
	
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JsonIgnore
	private Child child;

	public SubChild() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubChild(int id, String name, Child child) {
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

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}
	
	
}
