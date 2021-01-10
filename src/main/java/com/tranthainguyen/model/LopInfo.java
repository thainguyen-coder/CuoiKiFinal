package com.tranthainguyen.model;

public class LopInfo {

	private int maLop;
	private String tenLop;
	public LopInfo(int maLop, String tenLop) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
	}
	public LopInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaLop() {
		return maLop;
	}
	public void setMaLop(int maLop) {
		this.maLop = maLop;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	
}
