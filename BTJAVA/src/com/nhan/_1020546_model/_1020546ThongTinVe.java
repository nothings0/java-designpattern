package com.nhan._1020546_model;
import java.util.Date;

public abstract class _1020546ThongTinVe {
	public Date thoiDiemVao;
	public Date thoiDiemRa;
	
	public _1020546ThongTinVe() {
		super();
	}
	public Date getThoiDiemRa() {
		return thoiDiemRa;
	}
	public Date getThoiDiemVao() {
		return thoiDiemVao;
	}

	public void setThoiDiemVao(Date thoiDiemVao) {
		this.thoiDiemVao = thoiDiemVao;
	}
	public void setThoiDiemRa(Date thoiDiemRa) {
		this.thoiDiemRa = thoiDiemRa;
	}
	public abstract String getBienSoHoacSoVe();
	public abstract String getLoaiXe();		
	public abstract String getTinhTrang1();
	public abstract String getTinhTrang2();
	public abstract Double getGia();
}

