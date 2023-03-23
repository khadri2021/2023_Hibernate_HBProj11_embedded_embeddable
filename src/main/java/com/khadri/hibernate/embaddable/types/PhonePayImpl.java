package com.khadri.hibernate.embaddable.types;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Parent;

import com.khadri.hibernate.embaddable.entities.Store;
import com.khadri.hibernate.interfaces.Payment;

@Embeddable
public class PhonePayImpl implements Payment {

	@Column(name = "PAYMENT_UPI_ID")
	private String bankAccount;

	@Column(name = "PAMENT_PAYER_NAME")
	private String accountHolderName;
	
 
	@Parent
	private Store store;

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

}
