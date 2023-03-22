package com.khadri.hibernate.value.type.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Remote")
@Table(name = "REMOTE",schema = "2022batch")
public class Remote {

	@Id
	@Column(name = "REMOTE_ID", nullable = false, insertable = true, updatable = false, length = 50, table = "REMOTE")
	private int id;

	@Column(name = "REMOTE_NAME", nullable = false, insertable = true, updatable = true, length = 50, table = "REMOTE")
	private String name;

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

}
