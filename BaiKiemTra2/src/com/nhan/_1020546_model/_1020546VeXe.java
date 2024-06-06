package com.nhan._1020546_model;

import java.util.Date;

public class _1020546VeXe{
	private int LoaiXe;
	private String BienSoXe;
	private int SoVeXe;
	private Date TimeIn;
	private Date TimeOut;
	private String StateIn;
	private String StateOut;
	
	public _1020546VeXe(int loaiXe, String bienSoXe, int soVeXe, Date timeIn, Date timeOut, String stateIn,
			String stateOut) {
		super();
		LoaiXe = loaiXe;
		BienSoXe = bienSoXe;
		SoVeXe = soVeXe;
		TimeIn = timeIn;
		TimeOut = timeOut;
		StateIn = stateIn;
		StateOut = stateOut;
	}
	
	public _1020546VeXe(int loaiXe, String bienSoXe, int soVeXe, Date timeIn2, String stateIn) {
		super();
		LoaiXe = loaiXe;
		BienSoXe = bienSoXe;
		SoVeXe = soVeXe;
		TimeIn = timeIn2;
		StateIn = stateIn;
	}
	
	public _1020546VeXe() {
	}

	public String getStateIn() {
		return StateIn;
	}
	public void setStateIn(String stateIn) {
		StateIn = stateIn;
	}
	public String getStateOut() {
		return StateOut;
	}
	public void setStateOut(String stateOut) {
		StateOut = stateOut;
	}
	public int getLoaiXe() {
		return LoaiXe;
	}
	public void setLoaiXe(int loaiXe) {
		LoaiXe = loaiXe;
	}
	public String getBienSoXe() {
		return BienSoXe;
	}
	public void setBienSoXe(String bienSoXe) {
		BienSoXe = bienSoXe;
	}
	public int getSoVeXe() {
		return SoVeXe;
	}
	public void setSoVeXe(int soVeXe) {
		SoVeXe = soVeXe;
	}
	public Date getTimeIn() {
		return TimeIn;
	}
	public void setTimeIn(Date timeIn) {
		TimeIn = timeIn;
	}
	public Date getTimeOut() {
		return TimeOut;
	}
	public void setTimeOut(Date timeOut) {
		TimeOut = timeOut;
	}
	
}
