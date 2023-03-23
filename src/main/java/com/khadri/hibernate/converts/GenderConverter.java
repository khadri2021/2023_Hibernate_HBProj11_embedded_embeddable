package com.khadri.hibernate.converts;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.khadri.hibernate.enums.Gender;

@Converter
public class GenderConverter implements AttributeConverter<Gender, Character> {

	@Override
	public Character convertToDatabaseColumn(Gender gender) {

		if (gender.equals(Gender.MALE)) {
			return 'M';
		} else if (gender.equals(Gender.FEMALE)) {
			return 'F';
		} else {
			return 'O';
		}
	}

	@Override
	public Gender convertToEntityAttribute(Character gender) {
		return Gender.fromCharacterCode(gender);
	}

}