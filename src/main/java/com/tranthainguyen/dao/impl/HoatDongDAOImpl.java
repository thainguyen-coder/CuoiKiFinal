package com.tranthainguyen.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.tranthainguyen.dao.HoatDongDAO;
import com.tranthainguyen.entity.HoatDong;
import com.tranthainguyen.model.HoatDongInfo;

public class HoatDongDAOImpl implements HoatDongDAO {

	@Autowired
	private SessionFactory sessionfactory;

	public List<HoatDongInfo> listHoatDong() {
		
		  Session session = sessionfactory.getCurrentSession(); String sql =
		  " select new  " + HoatDongInfo.class.getName() +
		  " (hd.id,hd.maHD,hd.tenHD,hd.ngayHD,hd.noiDungHD,hd.nguoiQuanLy) " + " from "
		  + HoatDong.class.getName() + " hd "; Query query = session.createQuery(sql);
		  return query.list();

	}
}
