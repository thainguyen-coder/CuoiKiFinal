package com.tranthainguyen.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.tranthainguyen.dao.LopDAO;

import com.tranthainguyen.entity.Lop;

import com.tranthainguyen.model.LopInfo;

public class LopDAOImpl implements LopDAO {

	@Autowired
	private SessionFactory sessionfactory;
	@Override
	public List<LopInfo> listLop() {
		Session session = sessionfactory.getCurrentSession();
		String sql = " select new  " + LopInfo.class.getName()
				+ " (lop.maLop, lop.tenLop) " 
				+ " from " + Lop.class.getName() + " lop "; 
		Query query = session.createQuery(sql);
		return query.list();
	}

}
