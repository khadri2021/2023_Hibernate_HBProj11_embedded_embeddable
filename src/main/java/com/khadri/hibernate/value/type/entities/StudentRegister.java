package com.khadri.hibernate.value.type.entities;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.khadri.hibernate.converts.GenderConverter;
import com.khadri.hibernate.enums.Gender;

@Entity
public class StudentRegister {

	@Id
	@GeneratedValue(generator = "increment")
	@Column(name = "REGISTER_ID")
	private Long id;

	@Column(name = "STUDNET_NAME")
	private String name;

	@Convert(converter = GenderConverter.class)
	@Column(name = "GENDER")
	private Gender gender;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "GUARDIAN_NAME")
	private String guardianName;

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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

}
