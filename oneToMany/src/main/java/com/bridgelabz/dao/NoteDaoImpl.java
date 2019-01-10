package com.bridgelabz.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.persistence.Note;

public class NoteDaoImpl implements NoteDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public long save(Note note) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(note);
	      return   note.getId();
		
	}

	@Override
	public Note get(long id) {
		// TODO Auto-generated method stub
		return session.getCurrentSession().get(Note.class, id);
	}

	@Override
	public List<Note> list() {
		// TODO Auto-generated method stub
		Session sess = session.getCurrentSession();
	      CriteriaBuilder cb = sess.getCriteriaBuilder();
	      CriteriaQuery<Note> cq = cb.createQuery(Note.class);
	      Root<Note> root = cq.from(Note.class);
	      cq.select(root);
	      Query<Note> query = sess.createQuery(cq);
	      return query.getResultList();
	   
		
	}
   @Override
	public void update(long id, Note note) {
		// TODO Auto-generated method stub
		 Session sess = session.getCurrentSession();
	      Note note2 = sess.byId(Note.class).load(id);
	      note2.setName(note.getName());
	      note2 .setEmail(note.getEmail());
	      sess.flush();
	   }
	

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		Session sess = session.getCurrentSession();
	      Note note = sess.byId(Note.class).load(id);
	      sess.delete(note);
		
	}
	
	
}