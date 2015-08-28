package com.penhchet.data;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import com.penhchet.data.entities.Transaction;

public class JPACriterialAPIApplication {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager  em = null;
		EntityTransaction tx = null;
		try{
			emf = Persistence.createEntityManagerFactory("ifinances");
			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();
			
			// SELECT t FROM Transaction t
			CriteriaBuilder cb = em.getCriteriaBuilder();			
			CriteriaQuery<Transaction> criteriaQuery = cb.createQuery(Transaction.class);
			
			Root<Transaction> root = criteriaQuery.from(Transaction.class);
			Path<BigDecimal> amountPath = root.get("amount");
			Path<String> transactionTypePath = root.get("transactionType");
			
			criteriaQuery.select(root);
			criteriaQuery.where(cb.and(
					cb.le(amountPath, new BigDecimal("20.00")), 
					cb.equal(transactionTypePath,"withdrawl")));
			
			TypedQuery<Transaction> query = em.createQuery(criteriaQuery);			
			List<Transaction> transactions = query.getResultList();
			
			for(Transaction t : transactions){
				System.out.println(t.getAccount().getName());
			}
			
			
			tx.commit();
		}catch(Exception ex){
			tx.rollback();
			ex.printStackTrace();
		}finally{
			emf.close();
		}
	}
}
