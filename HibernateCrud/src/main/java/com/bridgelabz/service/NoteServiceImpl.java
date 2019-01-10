package com.bridgelabz.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.dao.NoteDao;
import com.bridgelabz.model.Note;


@Service
@Transactional
public class NoteServiceImpl implements NoteService {
    
	@Autowired
	private NoteDao publicationDao;

	
	@Transactional
	@Override
	public long save(Note publish) {
		// TODO Auto-generated method stub
		return publicationDao.save(publish);
	}
  
	@Override
	public Note get(long id) {
		// TODO Auto-generated method stub
		return publicationDao.get(id);
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
