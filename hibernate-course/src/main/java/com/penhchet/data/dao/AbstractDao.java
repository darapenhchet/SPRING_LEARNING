package com.penhchet.data.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;

import com.penhchet.data.HibernateUtil;
import com.penhchet.data.dao.interfaces.Dao;

public class AbstractDao<T, ID extends Serializable> implements Dao<T, ID> {
	
	private Class<T> persistentClass;
	
	private Session session;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments().getClass();
	}
	
	public void setSession(Session session){
		this.session = session;
	}

	
	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(Criterion ... criterion){
		Criteria criteria = this.getSession().createCriteria(this.getPersistentClass());
		
		for(Criterion c: criterion){
			criteria.add(c);
		}
		
		return (List<T>) criteria.list();
	}

	public T findById(ID id) {
		return (T) this.getSession().load(this.getPersistentClass(), id);
	}
	
	
	public List<T> findAll() {
		return this.findByCriteria();
	}
	
	public T save(T entity) {
		this.getSession().saveOrUpdate(entity);
		return entity;
	}

	public void delete(T entity) {
		this.getSession().delete(entity);
		
	}

	public void flush() {
		this.getSession().flush();
		
	}

	public void clear() {
		this.getSession().clear();
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	protected Session getSession() {
		if(this.session == null){
			this.session = HibernateUtil.getSessionFactory().getCurrentSession();
		}
		return session;
	}
	
}
