package com.khadri.hibernate.embaddable.types;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Configuration {

	@Column(name="CONFIG_RAM")
	private String ram;

	@Column(name = "CONFIG_STORAGE")
	private String storage;

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

}
