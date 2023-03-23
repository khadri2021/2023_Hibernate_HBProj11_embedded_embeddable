package com.khadri.hibernate.value.type.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.enums.Gender;
import com.khadri.hibernate.value.type.entities.StudentRegister;

public class Main2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Configuration cfg = new Configuration();

		Properties properties = new Properties();
		properties.load(new FileReader(new File("src/main/resources/hb.properties")));
		cfg.addProperties(properties);

		// Entity Mapping
		cfg.addAnnotatedClass(StudentRegister.class);// entity resource mapping in java

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction txn = session.beginTransaction();

		StudentRegister register = new StudentRegister();
		register.setGuardianName("ALLEN");
		register.setName("JHON");
		register.setPhoneNumber("9440877300");
		register.setGender(Gender.MALE);

		session.save(register);

		txn.commit();
		session.close();
		factory.close();
	}
}
