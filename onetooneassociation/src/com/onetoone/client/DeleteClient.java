package com.onetoone.client;

import org.hibernate.Session;

import com.onetoone.entity.Human;
import com.onetoone.sessionfactory.HibernateSessionFactory;

public class DeleteClient {

	public static void main(String[] args) {

		Session session1 = HibernateSessionFactory.getSession();
		session1.beginTransaction();

		Human human1 = session1.get(Human.class, 30);
		System.out.println(human1);
		
		session1.delete(human1);
		
		session1.getTransaction().commit();

	}

}
