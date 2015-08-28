package com.penhchet.data.dao.interfaces;

import java.util.List;

import com.penhchet.data.entities.User;

public interface UserDao extends Dao<User, Long>{
	
	public List<User> findByFirstName(String firstName);

}
