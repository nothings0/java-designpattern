package com.nhan._1020546_model;

public class _1020546ThongTinVeXeMay extends _1020546ThongTinVe{
	public String bienSo;
	
	public _1020546ThongTinVeXeMay() {
		super();
	}
	
	public String getBienSo() {
		return bienSo;
	}
	
	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	@Override
	public String getBienSoHoacSoVe() {
		// TODO Auto-generated method stub
		return this.getBienSo();
	}

	@Override
	public String getLoaiXe() {
		// TODO Auto-generated method stub
		return "2";
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
		var ms = 24*60*60*1000;
		var sumTime = this.getThoiDiemRa().getTime() - this.getThoiDiemVao().getTime();
		var price = 3000;
		var soTien = Math.ceil(sumTime / ms) * price;
		return soTien;
	}
}
