package com.penhchet.data;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.penhchet.data.entities.Address;
import com.penhchet.data.entities.Bank;
import com.penhchet.data.entities.User;

public class ApplicationJPA {
	
	public static void main(String[] args) {
		
		/*
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ifinances");
		EntityManager  em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		*/
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		try{
			entityManagerFactory = Persistence.createEntityManagerFactory("ifinances");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			
			transaction.begin();
			
			User user = new User();
			user.setBirthDate(getMyBirthday());
			user.setCreatedDate(new Date());
			user.setCreatedBy("PENHCHET");
			user.setEmailAddress("songdaravuth@gmail.com");
			user.setFirstName("DARAVUTH");
			user.setLastName("SONG");
			user.setLastUpdatedBy("PENHCHET");
			user.setLastUpdatedDate(new Date());
			
			Address address = new Address();
			address.setAddressLine1("PHNOM PENH");
			address.setAddressLine2("SIEM REAP");
			address.setCity("PHNOM PENH");
			address.setState("PP");
			address.setZipCode("855");
			
			entityManager.persist(user);
			
			transaction.commit();
			
		}catch(Exception e){
			e.printStackTrace();
			transaction.rollback();
		}finally{
			entityManager.close();
			entityManagerFactory.close();
		}
	}
	
	private static Date getMyBirthday(){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1992);
		calendar.set(Calendar.MONTH, 3);
		calendar.set(Calendar.DATE, 1);
		return calendar.getTime();
	}
}