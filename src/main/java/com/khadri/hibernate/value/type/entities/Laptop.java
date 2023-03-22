package com.khadri.hibernate.value.type.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.khadri.hibernate.embaddable.types.Configuration;

@Entity(name = "Laptop")
@Table(name = "LAPTOP_CONFIG",schema = "2022batch")
public class Laptop {

	// value types
	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Embedded
	private Configuration configs;

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

	public Configuration getConfigs() {
		return configs;
	}

	public void setConfigs(Configuration configs) {
		this.configs = configs;
	}

}
