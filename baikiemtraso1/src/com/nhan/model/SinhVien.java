package com.nhan.model;
import java.util.Date;

public class SinhVien {
	private String maSinhVien;
	private String hoTen;
	private boolean gioiTinhNam;
	private Date ngaySinh;
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public boolean isGioiTinhNam() {
		return gioiTinhNam;
	}
	public void setGioiTinhNam(boolean gioiTinhNam) {
		this.gioiTinhNam = gioiTinhNam;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public SinhVien(String maSinhVien, String hoTen, boolean gioiTinhNam, Date ngaySinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.gioiTinhNam = gioiTinhNam;
		this.ngaySinh = ngaySinh;
	}
	public SinhVien() {
	}
	
	
}
