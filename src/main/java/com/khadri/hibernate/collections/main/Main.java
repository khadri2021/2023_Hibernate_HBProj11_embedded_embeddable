package com.khadri.hibernate.collections.main;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.collections.entities.Student;

public class Main {

	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		Properties props = new Properties();
		props.load(new FileReader(new File("src/main/resources/hb.properties")));
		cfg.addProperties(props);
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		Student student = new Student();
		//student.setId(1L);
		student.setName("JHON");
		List<String> subjects = new ArrayList<>();
		subjects.add("java");
		subjects.add("hibernate");
		subjects.add("spring");
		subjects.add("spring boot");

		student.setSubjects(subjects);
		session.save(student);

		txn.commit();
		session.close();
		factory.close();

	}
}
