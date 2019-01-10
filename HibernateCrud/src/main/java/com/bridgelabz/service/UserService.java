package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.model.User;

public interface UserService {

   long save(User book);
   User get(long id);
   List<User> list();
   void update(long id, User book);
   void delete(long id);
}
