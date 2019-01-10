package com.bridgelabz.dao;

import java.util.List;

import com.bridgelabz.persistence.User;



public interface UserDao {
	long save(User user);

	   User get(long id);

	   List<User> list();

	   void update(long id, User user);

	   void delete(long id);
}
