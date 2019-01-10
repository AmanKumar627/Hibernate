package com.bridgelabz.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.bridgelabz.persistence.User;

public class UserDaoImpl implements UserDao {

	private SessionFactory session;
	
	
	@Override
	public long save(User user) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(user);
	      return user.getId();
		
	}

	@Override
	public User get(long id) {
		// TODO Auto-generated method stub
		return session.getCurrentSession().get(User.class, id);
	
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		Session sess = session.getCurrentSession();
	      CriteriaBuilder cb = sess.getCriteriaBuilder();
	      CriteriaQuery<User> cq = cb.createQuery(User.class);
	      Root<User> root = cq.from(User.class);
	      cq.select(root);
	      Query<User> query = sess.createQuery(cq);
	      return query.getResultList();
		
	}

	@Override
	public void update(long id, User user) {
		// TODO Auto-generated method stub
		Session sess = session.getCurrentSession();
	      User book2 = sess.byId(User.class).load(id);
	      book2.setName(user.getName());
	      book2.setEmail(user.getEmail());
	      sess.flush();
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		Session sess = session.getCurrentSession();
	      User book = sess.byId(User.class).load(id);
	      sess.delete(book);
	   
	}

}
