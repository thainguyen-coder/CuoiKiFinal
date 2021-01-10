package com.tranthainguyen.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.tranthainguyen.entity.HoatDong;
import com.tranthainguyen.model.HoatDongInfo;


@Transactional
public interface HoatDongDAO {

	public List<HoatDongInfo> listHoatDong();
}
