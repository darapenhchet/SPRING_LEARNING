package com.penhchet.data;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.penhchet.data.entities.Transaction;

public class HibernateCriteriaAPIApplication {
	public static void main(String[] args) {
		Session session = null;
		org.hibernate.Transaction transaction = null;
		int pageNumber =1 ;
		int pageSize = 5;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.getTransaction();
			transaction.begin();
			
			Criterion criterion1 = Restrictions.le("amount", new BigDecimal("20.00"));
			Criterion criterion2 = Restrictions.eq("transactionType", "Withdrawl");
			
			Criteria criteria = session.createCriteria(Transaction.class);
			
			//criteria.add(criterion1);
			//criteria.add(criterion2);
			
			criteria.add(Restrictions.and(criterion1, criterion2));
			
			criteria.addOrder(Order.desc("title"));
			
			criteria.setFirstResult((pageNumber-1) * pageSize);
			criteria.setMaxResults(pageSize);
			
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
