package com.bridgelabz.dao;

import java.util.List;

import com.bridgelabz.model.User;

public interface UserDao {

   long save(User book);

   User get(long id);

   List<User> list();

   void update(long id, User book);

   void delete(long id);

}
