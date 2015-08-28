package com.penhchet.data;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import com.penhchet.data.entities.Transaction;

public class HibernateCriteriaAPIApplication {
	public static void main(String[] args) {
		Session session = null;
		org.hibernate.Transaction transaction = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.getTransaction();
			transaction.begin();
			
			Criteria criteria = session.createCriteria(Transaction.class);
			
			criteria.addOrder(Order.desc("title"));
			
			List<Transaction> transactions = criteria.list();
			
			for(Transaction t : transactions){
				System.out.println(t.getAccount().getName());
			}
			
			transaction.commit();
			
		}catch(Exception ex){
			transaction.rollback();
			ex.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
	}
}
