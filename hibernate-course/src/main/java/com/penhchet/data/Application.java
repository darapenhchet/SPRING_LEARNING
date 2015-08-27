package com.penhchet.data;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

import com.penhchet.data.entities.Account;
import com.penhchet.data.entities.Budget;
import com.penhchet.data.entities.Transaction;

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
		
/*		Session session = HibernateUtil.getSessionFactory().openSession();
		
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
			
			Credential credential = new Credential();
			credential.setUsername("admin");
			credential.setPassword("admin");
			
			credential.setUser(user);
			user.setCredential(credential);
			
			session.save(credential);
			
			transaction.commit();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
		
		*/
		
		// ENTITY ASSOCIATION OneToOne Unidirectional + Bidirectional
		/*
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
			
			Credential credential = new Credential();
			credential.setUsername("admin");
			credential.setPassword("admin");
			
			credential.setUser(user);
			user.setCredential(credential);
			
			session.save(credential);
			
			transaction.commit();
			
			User dbUser = session.get(User.class, credential.getUser().getUserId());
					
			System.out.println("DB FIRSTNAME="+dbUser.getFirstName());
			
			Credential dbCredential = session.get(Credential.class, user.getCredential().getCredentialId());
			
			System.out.println("USERNAME="+dbCredential.getUsername());
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
		
		*/
		
		// ONE TO MANY Unidirectional Mapping + Bidirectional Mapping
/*		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try{
			org.hibernate.Transaction transaction = session.beginTransaction();
			
			transaction.begin();
			
			Account account = new Account();
			
			account.setName("PENHCHET");
			account.setInitialBalance(new BigDecimal(1000.54));
			account.setCurrentBalance(new BigDecimal(1000.54));
			account.setOpenDate(new Date());
			account.setCreatedDate(new Date());
			account.setCreatedBy("PENHCHET");
			account.setLastUpdatedDate(new Date());
			account.setLastUpdatedBy("PENHCHET");
			account.setCloseDate(new Date());
			
			Transaction shoePurchase = new Transaction();
			shoePurchase.setAccount(account);
			shoePurchase.setTitle("New Shoe");
			shoePurchase.setAmount(new BigDecimal("100.00"));
			shoePurchase.setClosingBalanace(new BigDecimal("0.00"));
			shoePurchase.setCreatedBy("PENHCHET");
			shoePurchase.setCreatedDate(new Date());
			shoePurchase.setInitialBalance(new BigDecimal("0.00"));
			shoePurchase.setLastUpdatedBy("PENHCHET");
			shoePurchase.setLastUpdatedDate(new Date());
			shoePurchase.setNotes("New Shoe Arrival");
			shoePurchase.setTransactionType("Debit");
			
			Transaction beltPurchase = new Transaction();
			beltPurchase.setAccount(account);
			beltPurchase.setTitle("Jean Belt");
			beltPurchase.setAmount(new BigDecimal("100.00"));
			beltPurchase.setClosingBalanace(new BigDecimal("0.00"));
			beltPurchase.setCreatedBy("PENHCHET");
			beltPurchase.setCreatedDate(new Date());
			beltPurchase.setInitialBalance(new BigDecimal("0.00"));
			beltPurchase.setLastUpdatedBy("PENHCHET");
			beltPurchase.setLastUpdatedDate(new Date());
			beltPurchase.setNotes("New Jean Belt");
			beltPurchase.setTransactionType("Debit");
			
			account.getTransactions().add(shoePurchase);
			account.getTransactions().add(beltPurchase);
			
			session.save(account);
			
			transaction.commit();
			
			Transaction dbTransaction = session.get(Transaction.class, account.getTransactions().get(0).getTransactionId());
			
			System.out.println("ACCOUNT NAME="+ dbTransaction.getAccount().getName());
						
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}*/
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try{
			org.hibernate.Transaction transaction = session.beginTransaction();
			
			transaction.begin();
			
			Account account = new Account();
			
			account.setName("PENHCHET");
			account.setInitialBalance(new BigDecimal(1000.54));
			account.setCurrentBalance(new BigDecimal(1000.54));
			account.setOpenDate(new Date());
			account.setCreatedDate(new Date());
			account.setCreatedBy("PENHCHET");
			account.setLastUpdatedDate(new Date());
			account.setLastUpdatedBy("PENHCHET");
			account.setCloseDate(new Date());
			
			Budget budget = new Budget();
			budget.setGoalAmount(new BigDecimal(10000.00));
			budget.setName("Emergency Fund");
			budget.setPeroid("Yearly");
			
			Transaction shoePurchase = new Transaction();
			shoePurchase.setAccount(account);
			shoePurchase.setTitle("New Shoe");
			shoePurchase.setAmount(new BigDecimal("100.00"));
			shoePurchase.setClosingBalanace(new BigDecimal("0.00"));
			shoePurchase.setCreatedBy("PENHCHET");
			shoePurchase.setCreatedDate(new Date());
			shoePurchase.setInitialBalance(new BigDecimal("0.00"));
			shoePurchase.setLastUpdatedBy("PENHCHET");
			shoePurchase.setLastUpdatedDate(new Date());
			shoePurchase.setNotes("New Shoe Arrival");
			shoePurchase.setTransactionType("Debit");
			
			Transaction beltPurchase = new Transaction();
			beltPurchase.setAccount(account);
			beltPurchase.setTitle("Jean Belt");
			beltPurchase.setAmount(new BigDecimal("100.00"));
			beltPurchase.setClosingBalanace(new BigDecimal("0.00"));
			beltPurchase.setCreatedBy("PENHCHET");
			beltPurchase.setCreatedDate(new Date());
			beltPurchase.setInitialBalance(new BigDecimal("0.00"));
			beltPurchase.setLastUpdatedBy("PENHCHET");
			beltPurchase.setLastUpdatedDate(new Date());
			beltPurchase.setNotes("New Jean Belt");
			beltPurchase.setTransactionType("Debit");
			
			budget.getTransactions().add(shoePurchase);
			budget.getTransactions().add(beltPurchase);
			
			session.save(budget);
			
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
