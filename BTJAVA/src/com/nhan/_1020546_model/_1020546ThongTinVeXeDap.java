package com.nhan._1020546_model;

public class _1020546ThongTinVeXeDap extends _1020546ThongTinVe{
	private String soVe;
	public _1020546ThongTinVeXeDap() {
		
	}
	public String getSoVe() {
		return soVe;
	}
	public void setSoVe(String soVe) {
		this.soVe = soVe;
	}
	@Override
	public String getBienSoHoacSoVe() {
		// TODO Auto-generated method stub
		return this.getSoVe();
	}
	@Override
	public String getLoaiXe() {
		// TODO Auto-generated method stub
		return "0";
	}

	@Override
	public String getTinhTrang1() {
		// TODO Auto-generated method stub
		return "-";
	}

	@Override
	public String getTinhTrang2() {
		// TODO Auto-generated method stub
		return "-";
	}

	@Override
	public Double getGia() {
		var soMsguixe = 24*60*60*1000;
		var soThoiGian = this.getThoiDiemRa().getTime() - this.getThoiDiemVao().getTime();
		var price = 2000;
		var soTien = Math.ceil(soThoiGian / soMsguixe) * price;
		return soTien;
	}
}