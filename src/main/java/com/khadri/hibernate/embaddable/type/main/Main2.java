package com.khadri.hibernate.embaddable.type.main;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.embaddable.types.Address;
import com.khadri.hibernate.value.type.entities.Student;

public class Main2 {

	public static void main(String[] args) throws Exception {

		Configuration cfg = new Configuration();

		Properties properties = new Properties();
		properties.load(new FileReader(new File("src/main/resources/hb.properties")));
		cfg.addProperties(properties);

		cfg.addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		Student student = new Student();
		student.setId(1L);
		student.setName("JHON");

		Address presentAddress = new Address();
		presentAddress.setDoorNo("9-09");
		presentAddress.setStreetName("7/G Colony");
		presentAddress.setLandMark("NEAR DATTA-FUNCTIONAL");

		Address permentAddress = new Address();
		permentAddress.setDoorNo("8-08");
		permentAddress.setStreetName("9/G Colony");
		permentAddress.setLandMark("NEAR TEMPLE");

		student.setPresentAddress(presentAddress);
		student.setPermenetAddress(permentAddress);

		session.save(student);

		txn.commit();
		session.close();
		factory.close();

	}
}
