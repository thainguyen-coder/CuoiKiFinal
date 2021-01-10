package com.tranthainguyen.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tranthainguyen.dao.HoatDongDAO;
import com.tranthainguyen.dao.LopDAO;
import com.tranthainguyen.model.HoatDongInfo;
import com.tranthainguyen.model.LopInfo;

@Controller
public class HomeController {
	
	@Autowired 
	private HoatDongDAO hoatDongDAO;
	
	@Autowired
	private LopDAO lopDAO;
	
	//trang chu
	@RequestMapping("/home")
	public String indexPage(Model model,HttpServletRequest request, HttpSession session) {
		//load hang
		List<HoatDongInfo> loadHD = hoatDongDAO.listHoatDong();
		model.addAttribute("listHD",loadHD);
		return "index";
		
	}
	
	@RequestMapping("/lop")
	public String lopPage(Model model,HttpServletRequest request, HttpSession session) {
		//load hang
		List<LopInfo> loadLOP = lopDAO.listLop();
		model.addAttribute("listLOP",loadLOP);
		return "lop";
		
	}

}
