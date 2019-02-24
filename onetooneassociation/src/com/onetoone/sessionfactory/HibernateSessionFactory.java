package com.onetoone.sessionfactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetoone.entity.Human;
import com.onetoone.entity.Passport;

public class HibernateSessionFactory {

	private static SessionFactory sessionFactory = getSessionFactory();
	private static Session session;

	private static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Passport.class).addAnnotatedClass(Human.class).buildSessionFactory();
		return sessionFactory;
	}

	public static Session getSession() {
		session = sessionFactory.getCurrentSession();
		return session;
	}
}
