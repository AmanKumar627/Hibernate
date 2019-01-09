package com.bridgelabz.dao;

import java.util.List;

import com.bridgelabz.model.Book;
import com.bridgelabz.model.Publication;

public interface PublicationDao {
	 long save(PublicationDao publish);

	  Publication get(long id);

	   List<PublicationDao> list();

	   void update(long id, PublicationDao publish);

	   void delete(long id);

	

	}


