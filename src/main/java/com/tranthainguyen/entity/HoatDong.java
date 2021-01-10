package com.tranthainguyen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hoatdong")
public class HoatDong {
	
	private int id;
	private String maHD;
	private String tenHD;
	private String ngayHD;
	private String noiDungHD;
	private String nguoiQuanLy;
	
	
	@Id
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="MaHD")
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	@Column(name="TenHD")
	public String getTenHD() {
		return tenHD;
	}
	public void setTenHD(String tenHD) {
		this.tenHD = tenHD;
	}
	@Column(name="NgayHD")
	public String getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(String ngayHD) {
		this.ngayHD = ngayHD;
	}
	@Column(name="NoiDungHD")
	public String getNoiDungHD() {
		return noiDungHD;
	}
	public void setNoiDungHD(String noiDungHD) {
		this.noiDungHD = noiDungHD;
	}
	@Column(name="NguoiQuanLy")
	public String getNguoiQuanLy() {
		return nguoiQuanLy;
	}
	public void setNguoiQuanLy(String nguoiQuanLy) {
		this.nguoiQuanLy = nguoiQuanLy;
	}
	

}
