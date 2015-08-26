package com.penhchet.data;

import java.util.Date;

import org.hibernate.Session;

import com.penhchet.data.entities.User;

public class Application {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		User user = new User();
		user.setBirthDate(new Date());
		user.setCreatedDate(new Date());
		user.setCreatedBy("PENHCHET");
		user.setEmailAddress("kreysophannatt@gmail.com");
		user.setFirstName("SOPHANNATT");
		user.setLastName("KREY");
		user.setLastUpdatedBy("PENHCHET");
		user.setLastUpdatedDate(new Date());
		
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
