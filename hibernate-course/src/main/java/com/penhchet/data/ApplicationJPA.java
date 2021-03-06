package com.penhchet.data;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.penhchet.data.entities.Account;
import com.penhchet.data.entities.Market;

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
	
			// 1. PERSIST DATA
/*
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
*/
			
			// 2. RETRIEVING ENTITY
			
			/*
			User user = entityManager.getReference(User.class, 3L);
			
			System.out.println(entityManager.contains(user));
			entityManager.remove(user);
			System.out.println(entityManager.contains(user));
			
			*/
			
			/*
			Currency currency = new Currency();
			currency.setCountryName("KHMER");
			currency.setName("Riel");
			currency.setSymbol("R");
			
			Market market = new Market();
			market.setMarketName("KHMER Stock Exchange");
			market.setCurrency(currency);
			
			entityManager.persist(market);
			
			transaction.commit();
			
			Currency dbCurrency = (Currency)entityManager.find(Currency.class, new CurrencyId("Riel","Cambodia"));
			
			System.out.println(dbCurrency.getName());
			
			
			Market dbMarket = (Market) entityManager.find(Market.class, market.getMarketId());
					
			System.out.println("CURRENCY="+dbMarket.getCurrency().getName());
			
			*/
/*			
			Query query = entityManager.createQuery("FROM Market m");
			List<Market> markets = query.getResultList();
			
			for(Market market : markets){
				System.out.println(market.getMarketName());
			}
*/
			//TypedQuery<Market> query = entityManager.createQuery("FROM Market m where m.id = ?", Market.class);
			//TypedQuery<Market> query = entityManager.createQuery("FROM Market m where m.id = ?1", Market.class);
			//TypedQuery<Market> query = entityManager.createQuery("FROM Market m where m.id = :id", Market.class);
			//Query query = entityManager.createQuery("FROM Market m");
			
			//query.setParameter("id", 12L);
			
			//List<Market> markets = query.getResultList();
			
			//for(Market market : markets){
			//	System.out.println(market.getMarketName());
			//}
			
/*			TypedQuery<Account> query = entityManager.createQuery("SELECT distinct a FROM Transaction t"
															    + " JOIN t.account a "
																+ " WHERE t.amount > 500 and t.transactionType ='Deposit'", Account.class);
			
			List<Account> accounts = query.getResultList();
			
			for(Account account : accounts){
				System.out.println(account.getName());
			}*/
			
			/*TypedQuery<Account> query = entityManager.createQuery("SELECT distinct a FROM Transaction t"
				    + " JOIN t.account a "
					+ " WHERE t.amount > 500 and t.transactionType ='Deposit'", Account.class);*/

			Query query = entityManager.createNamedQuery("Account.largeDeposits");
			List<Account> accounts = query.getResultList();
			
			for(Account account : accounts){
				System.out.println(account.getName());
			}
			
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
