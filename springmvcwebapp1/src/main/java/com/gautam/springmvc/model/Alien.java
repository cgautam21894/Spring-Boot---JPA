package com.gautam.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	private int id;
	private String name;

	public Alien() {

	}

	public Alien(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Alien [name=" + name + ", id=" + id + "]";
	}

}
