package com.penhchet.data.dao;

import java.util.List;

import com.penhchet.data.dao.interfaces.UserDao;
import com.penhchet.data.entities.User;

public class UserHibernateDao extends AbstractDao<User, Long> implements UserDao{

	public List<User> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
