package com.bridgelabz.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.model.Book;

public interface PublicationService {

	@Transactional
	   @Override
	   public long save( Publication publish) {
	      return bookDao.save(book);
	   }

	   @Override
	   public Book get(long id) {
	      return bookDao.get(id);
	   }

	   @Override
	   public List<Book> list() {
	      return bookDao.list();
	   }

	   @Transactional
	   @Override
	   public void update(long id, Book book) {
	      bookDao.update(id, book);
	   }

	   @Transactional
	   @Override
	   public void delete(long id) {
	      bookDao.delete(id);
	   }

	}
}
