package com.nhan._1020546_model;

public class _1020546ThongTinVeOto extends _1020546ThongTinVe{
	private String bienSo;
	private String tinhTrangVao;
	private String tinhTrangRa;
	
	public _1020546ThongTinVeOto() {
		super();
	}
	
	public String getBienSo() {
		return bienSo;
	}
	@Override
	public String getBienSoHoacSoVe() {
		// TODO Auto-generated method stub
		return this.getBienSo();
	}

	public void setTinhTrangVao(String tinhTrangVao) {
		this.tinhTrangVao = tinhTrangVao;
	}
	public void setTinhTrangRa(String tinhTrangRa) {
		this.tinhTrangRa = tinhTrangRa;
	}
	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}
	@Override
	public String getLoaiXe() {
		// TODO Auto-generated method stub
		return "4";
	}

	@Override
	public String getTinhTrang1() {
		// TODO Auto-generated method stub
		return this.tinhTrangVao;
	}

	@Override
	public String getTinhTrang2() {
		// TODO Auto-generated method stub
		return this.tinhTrangRa;
	}

	@Override
	public Double getGia() {
		var ms = 30 * 60 * 1000;
		var sumTime = this.getThoiDiemRa().getTime() - this.getThoiDiemVao().getTime();
		var price = 5000;
		var soTien = Math.ceil(sumTime / ms) * price;
		return soTien;
	}
}
