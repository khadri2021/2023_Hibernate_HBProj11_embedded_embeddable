package com.khadri.hibernate.embaddable.type.main;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.value.type.entities.Laptop;

public class Main1 {

	public static void main(String[] args) throws Exception {

		Configuration cfg = new Configuration();

		Properties properties = new Properties();
		properties.load(new FileReader(new File("src/main/resources/hb.properties")));
		cfg.addProperties(properties);

		cfg.addAnnotatedClass(Laptop.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		Laptop laptop = new Laptop();
		laptop.setId(1);
		laptop.setName("HP");
		com.khadri.hibernate.embaddable.types.Configuration configuration = new com.khadri.hibernate.embaddable.types.Configuration();
		configuration.setRam("32GB");
		configuration.setStorage("2TB");

		laptop.setConfigs(configuration);

		session.save(laptop);

		txn.commit();
		session.close();
		factory.close();

	}
}
