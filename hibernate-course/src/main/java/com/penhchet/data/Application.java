package com.penhchet.data;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.penhchet.data.entities.Address;
import com.penhchet.data.entities.Bank;
import com.penhchet.data.entities.User;

public class Application {
	
	public static void main(String[] args) {
		
		
		
/*		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try{
			session.getTransaction().begin();
			
			User user = new User();
			user.setBirthDate(getMyBirthday());
			user.setCreatedDate(new Date());
			user.setCreatedBy("PENHCHET");
			user.setEmailAddress("darapenhchet@gmail.com");
			user.setFirstName("PENHCHET");
			user.setLastName("DARA");
			user.setLastUpdatedBy("PENHCHET");
			user.setLastUpdatedDate(new Date());
			
			Address address = new Address();
			address.setAddressLine1("PHNOM PENH");
			address.setAddressLine2("SIEM REAP");
			address.setCity("PHNOM PENH");
			address.setState("PP");
			address.setZipCode("855");
			
			user.setAddress(address);
			
			session.save(user);
			session.getTransaction().commit();
			
			session.refresh(user);
			
			System.out.println("AGE="+user.getAge());
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}*/		
		
		
		/*Session session = HibernateUtil.getSessionFactory().openSession();
		try{
			session.getTransaction().begin();
			
			TimeTest test = new TimeTest(new Date());
			session.save(test);
			session.getTransaction().commit();
			
			session.refresh(test);
			
			System.out.println(test.toString());
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}*/
		
		
/*		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try{
			Transaction transaction = session.beginTransaction();
			
			Bank bank = new Bank();
			bank.setName("ABA BANK");
			bank.setCreatedBy("PENHCHET");
			bank.setCreatedDate(new Date());
			bank.setLastUpdatedBy("PENHCHET");
			bank.setLastUpdatedDate(new Date());
			bank.setInternational(false);
			
			Address address = new Address();
			address.setAddressLine1("PHNOM PENH");
			address.setAddressLine2("SIEM REAP");
			address.setCity("PHNOM PENH");
			address.setState("PP");
			address.setZipCode("855");
			// SET ADDRESS IN BANK
			bank.setAddress(address);
			
			bank.getContacts().add("SOPHANNATT");
			bank.getContacts().add("BORA");
			bank.getContacts().add("RAVUTH");
			bank.getContacts().add("TOLA");
			
			session.save(bank);
			
			transaction.commit();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}	
		*/
		
		// MAP VALUE_TYPE COLLECTION
	/*		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try{
			Transaction transaction = session.beginTransaction();
			
			Bank bank = new Bank();
			bank.setName("ABA BANK");
			bank.setCreatedBy("PENHCHET");
			bank.setCreatedDate(new Date());
			bank.setLastUpdatedBy("PENHCHET");
			bank.setLastUpdatedDate(new Date());
			bank.setInternational(false);
			
			Address address = new Address();
			address.setAddressLine1("PHNOM PENH");
			address.setAddressLine2("SIEM REAP");
			address.setCity("PHNOM PENH");
			address.setState("PP");
			address.setZipCode("855");
			// SET ADDRESS IN BANK
			bank.setAddress(address);
			
			bank.getContacts().put("R A","SOPHANNATT");
			bank.getContacts().put("Researcher Assistant","BORA");
			bank.getContacts().put("Software Developer","RAVUTH");
			
			session.save(bank);
			
			transaction.commit();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
 	*/
		
		// MAP MAPPING COMPOSITE COLLECTION
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try{
			Transaction transaction = session.beginTransaction();
			
			User user = new User();
			user.setBirthDate(getMyBirthday());
			user.setCreatedDate(new Date());
			user.setCreatedBy("PENHCHET");
			user.setEmailAddress("darapenhchet@gmail.com");
			user.setFirstName("PENHCHET");
			user.setLastName("DARA");
			user.setLastUpdatedBy("PENHCHET");
			user.setLastUpdatedDate(new Date());
			
			Address address = new Address();
			address.setAddressLine1("PHNOM PENH");
			address.setAddressLine2("SIEM REAP");
			address.setCity("PHNOM PENH");
			address.setState("PP");
			address.setZipCode("855");
			
			Address address1 = new Address();
			address1.setAddressLine1("PP");
			address1.setAddressLine2("SIEM REAP");
			address1.setCity("PP");
			address1.setState("PP");
			address1.setZipCode("855");
			
			user.getAddress().add(address);
			user.getAddress().add(address1);
			
			session.save(user);
			
			transaction.commit();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
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