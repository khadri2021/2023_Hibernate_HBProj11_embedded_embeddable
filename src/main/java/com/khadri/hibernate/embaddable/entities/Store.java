package com.khadri.hibernate.embaddable.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Target;

import com.khadri.hibernate.embaddable.types.PhonePayImpl;
import com.khadri.hibernate.interfaces.Payment;

@Entity(name = "Store")
@Table(name = "STORE_PAYMENT")
public class Store {
	
	@Id
	@Column(name = "STORE_ID")
	private Long id;
	
	@Column(name="STORE_NAME")
	private String name;
	
	@Embedded
	@Target(PhonePayImpl.class)
	private Payment payment;

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

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	
}
