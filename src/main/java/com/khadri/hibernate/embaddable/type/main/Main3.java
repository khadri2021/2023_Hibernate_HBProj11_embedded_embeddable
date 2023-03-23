package com.khadri.hibernate.embaddable.type.main;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.embaddable.entities.Store;
import com.khadri.hibernate.embaddable.types.PhonePayImpl;

public class Main3 {

	public static void main(String[] args) throws Exception {

		Configuration cfg = new Configuration();

		Properties properties = new Properties();
		properties.load(new FileReader(new File("src/main/resources/hb.properties")));
		cfg.addProperties(properties);

		cfg.addAnnotatedClass(Store.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		Store store = new Store();
		store.setId(1L);
		store.setName("KADIRI-HYPER-MART");

		PhonePayImpl payment = new PhonePayImpl();
		payment.setAccountHolderName("JHON");
		payment.setBankAccount("9440877300@ybl");

		store.setPayment(payment);

		session.save(store);

		txn.commit();
		session.close();
		factory.close();

	}
}
