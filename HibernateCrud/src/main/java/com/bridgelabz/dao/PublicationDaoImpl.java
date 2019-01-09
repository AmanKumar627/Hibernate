package com.bridgelabz.dao;

import java.util.List;

import org.hibernate.SessionFactory;


import com.bridgelabz.model.Publication;

public class PublicationDaoImpl implements PublicationDao{

	private SessionFactory sessionFactory;
	
	@Override
	public long save(PublicationDao publish) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(publish);
	      return  ((Publication) publish).getId();
		
	}

	@Override
	public Publication get(long id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<PublicationDao> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(long id, PublicationDao publish) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
