package com.onetoone.client;

import org.hibernate.Session;

import com.onetoone.entity.Human;
import com.onetoone.entity.Passport;
import com.onetoone.sessionfactory.HibernateSessionFactory;

public class GetClient {

	public static void main(String[] args) {

		Session session1 = HibernateSessionFactory.getSession();
		session1.beginTransaction();

		Human human1 = session1.get(Human.class, 27);
		System.out.println(human1);
		session1.getTransaction().commit();

	}

}
