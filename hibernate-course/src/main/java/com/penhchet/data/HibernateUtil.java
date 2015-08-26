package com.penhchet.data;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.penhchet.data.entities.User;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		// hibernate.cfg.xml file configuration
		try {
			Configuration configuration = new Configuration();
			// configuration.addAnnotatedClass(User.class);
			/*
			 * return configuration.configure("hibernate.cfg.xml")
					.buildSessionFactory(
							new StandardServiceRegistryBuilder()
							.applySettings(configuration.getProperties())
									.build());
			 */
			return configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(
					"There was an error building the factory.");
		}

		// hibernate.properties file configuration

		// try {
		// Configuration configuration = new Configuration();
		// configuration.addAnnotatedClass(User.class);
		// return configuration
		// .buildSessionFactory(new StandardServiceRegistryBuilder()
		// .build());
		// } catch (Exception ex) {
		// ex.printStackTrace();
		// throw new RuntimeException(
		// "There was an error building the factory.");
		// }

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
