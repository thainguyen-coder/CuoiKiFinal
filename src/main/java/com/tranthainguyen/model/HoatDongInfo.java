package com.tranthainguyen.model;

public class HoatDongInfo {
	
	private int id;
	private String maHD;
	private String tenHD;
	private String ngayHD;
	private String noiDungHD;
	private String nguoiQuanLy;
	public HoatDongInfo(int id, String maHD, String tenHD, String ngayHD, String noiDungHD, String nguoiQuanLy) {
		super();
		this.id = id;
		this.maHD = maHD;
		this.tenHD = tenHD;
		this.ngayHD = ngayHD;
		this.noiDungHD = noiDungHD;
		this.nguoiQuanLy = nguoiQuanLy;
	}
	public HoatDongInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public String getTenHD() {
		return tenHD;
	}
	public void setTenHD(String tenHD) {
		this.tenHD = tenHD;
	}
	public String getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(String ngayHD) {
		this.ngayHD = ngayHD;
	}
	public String getNoiDungHD() {
		return noiDungHD;
	}
	public void setNoiDungHD(String noiDungHD) {
		this.noiDungHD = noiDungHD;
	}
	public String getNguoiQuanLy() {
		return nguoiQuanLy;
	}
	public void setNguoiQuanLy(String nguoiQuanLy) {
		this.nguoiQuanLy = nguoiQuanLy;
	}
	
	
}
