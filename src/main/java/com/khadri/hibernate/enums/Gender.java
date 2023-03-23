package com.khadri.hibernate.enums;

public enum Gender {

	MALE('M'), FEMALE('F'), OTHERS('O');

	private Character gender;

	private Gender(Character gender) {
		this.gender = gender;
	}

	public Character getGender() {
		return this.gender;
	}

	public static Gender fromCharacterCode(Character gender) {
		
		if(gender.equals('M')) {
			return MALE;
		}else if(gender.equals('F')) {
			return FEMALE;
		}else {
			return OTHERS;
		}
	}

}
