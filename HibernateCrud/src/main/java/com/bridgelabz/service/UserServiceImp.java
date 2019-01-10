package com.bridgelabz.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.dao.UserDao;
import com.bridgelabz.model.User;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao bookDao;

   @Transactional
   @Override
   public long save(User book) {
      return bookDao.save(book);
   }

   @Override
   public User get(long id) {
      return bookDao.get(id);
   }

   @Override
   public List<User> list() {
      return bookDao.list();
   }

   @Transactional
   @Override
   public void update(long id, User book) {
      bookDao.update(id, book);
   }

   @Transactional
   @Override
   public void delete(long id) {
      bookDao.delete(id);
   }

}
