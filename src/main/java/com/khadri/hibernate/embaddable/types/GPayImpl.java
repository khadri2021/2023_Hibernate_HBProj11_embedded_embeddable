package com.khadri.hibernate.embaddable.types;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.khadri.hibernate.interfaces.Payment;

@Embeddable
public class GPayImpl implements Payment {

	@Column(name = "PAYMENT_UPI_ID")
	private String upiId;

	@Column(name = "PAMENT_PAYER_NAME")
	private String payerName;

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

}
