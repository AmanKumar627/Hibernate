package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.persistence.User;



public interface NoteService {
	long save(User user);
	   User get(long id);
	   List<User> list();
	   void update(long id, User book);
	   void delete(long id);
}
