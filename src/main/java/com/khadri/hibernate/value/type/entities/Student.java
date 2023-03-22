package com.khadri.hibernate.value.type.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.khadri.hibernate.embaddable.types.Address;

@Entity
public class Student {

	@Id
	@Column(name = "STUDENT_ID")
	private Long id;

	@Column(name = "STUDNET_NAME")
	private String name;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "doorNo", column = @Column(name = "PRESENT_DOOR_NO")),
			@AttributeOverride(name = "streetName", column = @Column(name = "PRESENT_STREET_NAME")),
			@AttributeOverride(name = "landMark", column = @Column(name = "PRESENT_LAND_MARK")) })
	private Address presentAddress;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "doorNo", column = @Column(name = "PERMENENT_DOOR_NO")),
			@AttributeOverride(name = "streetName", column = @Column(name = "PERMENENT_STREET_NAME")),
			@AttributeOverride(name = "landMark", column = @Column(name = "PERMENENT_LAND_MARK")) })
	private Address permenetAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}

	public Address getPermenetAddress() {
		return permenetAddress;
	}

	public void setPermenetAddress(Address permenetAddress) {
		this.permenetAddress = permenetAddress;
	}

}
