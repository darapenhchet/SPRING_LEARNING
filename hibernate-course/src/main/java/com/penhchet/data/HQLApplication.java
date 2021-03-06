package com.penhchet.data;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.penhchet.data.entities.Account;

public class HQLApplication {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.getTransaction();
			transaction.begin();
			
			Query query = session.getNamedQuery("Account.largeDeposits");
			
			List<Account> accounts = query.list();
			
			for(Account account : accounts){
				System.out.println(account.getName());
			}
			transaction.commit();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
	}
}
