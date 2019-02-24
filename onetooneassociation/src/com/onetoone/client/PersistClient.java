package com.onetoone.client;

import org.hibernate.Session;

import com.onetoone.entity.Human;
import com.onetoone.entity.Passport;
import com.onetoone.sessionfactory.HibernateSessionFactory;

public class PersistClient {

	public static void main(String[] args) {

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();

		Passport passport = new Passport("ABC1234");
		Human human = new Human("Taher", passport);
		session.persist(human);
		System.out.println("Record inserted successfully");
		session.getTransaction().commit();
	}

}
