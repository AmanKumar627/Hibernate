package com.bridgelabz.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.User;
import com.bridgelabz.model.Note;

@Repository
public class NoteDaoImpl implements NoteDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(Note publish) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(publish);
	      return   publish.getId();
		
	}

	@Override
	public Note get(long id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Note.class, id);
	}

	@Override
	public List<Note> list() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
	      CriteriaBuilder cb = session.getCriteriaBuilder();
	      CriteriaQuery<Note> cq = cb.createQuery(Note.class);
	      Root<Note> root = cq.from(Note.class);
	      cq.select(root);
	      Query<Note> query = session.createQuery(cq);
	      return query.getResultList();
	   
		
	}
   @Override
	public void update(long id, Note publish) {
		// TODO Auto-generated method stub
		 Session session = sessionFactory.getCurrentSession();
	      Note publish2 = session.byId(Note.class).load(id);
	      publish2.setName(publish2.getName());
	      publish2 .setPrice(publish2.getPrice());
	      session.flush();
	   }
	

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
	      Note publish = session.byId(Note.class).load(id);
	      session.delete(publish);
		
	}

}
