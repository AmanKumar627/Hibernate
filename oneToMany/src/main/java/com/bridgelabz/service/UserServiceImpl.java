package com.bridgelabz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.dao.UserDao;
import com.bridgelabz.persistence.User;


public class UserServiceImpl {

	@Autowired
	   private UserDao userDao;

	   @Transactional
	   public long save(User user) {
	      return userDao.save(user);
	   }

	   public User get(long id) {
	      return userDao.get(id);
	   }

	   public List<User> list() {
	      return userDao.list();
	   }

	   @Transactional
	   public void update(long id, User user) {
	      userDao.update(id, user);
	   }

	   @Transactional
	   public void delete(long id) {
	      userDao.delete(id);
	   }
}
