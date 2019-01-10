package com.bridgelabz.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.dao.NoteDao;


public interface UserService {

	@Autowired
	private NoteDao noteDao;

	
	@Transactional
	@Override
	public long save(Note note) {
		// TODO Auto-generated method stub
		return noteDao.save(note);
	}
  
	@Override
	public Note get(long id) {
		// TODO Auto-generated method stub
		return noteDao.get(id);
	}
	
    
	@Override
	public List<Note> list() {
		// TODO Auto-generated method stub
		return publicationDao.list();
	}

	@Transactional
	@Override
	public void update(long id, Note publish) {
	
		 publicationDao.update(id, publish);
	}

	
	@Transactional
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		publicationDao.delete(id);
	}
	
	
		
	
}
