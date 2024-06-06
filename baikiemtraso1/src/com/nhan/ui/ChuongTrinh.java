package com.nhan.ui;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.nhan.dbconnect.DbConnection;
import com.nhan.model.SinhVien;
import com.nhan.service.SinhVienService;

public class ChuongTrinh {

	public static void main(String[] args) throws IOException {
		SinhVienService sinhVienService = new SinhVienService(DbConnection.getInstance());
//		1. selectAll
		var lst = sinhVienService.selectAll();
		System.out.println("DANH SÁCH SINH VIÊN");
		inDsSinhVien(lst);
		
//		2. insert sinh viên
		var newSinhVien = new SinhVien("T1239", "Lê Văn L", true, convertToDate("2003/12/30"));
		if (sinhVienService.insert(newSinhVien)) {
			System.out.println("\n\nĐã insert thành công");
			lst = sinhVienService.selectAll();
			System.out.println("DANH SÁCH SINH VIÊN SAU KHI INSERT");
			inDsSinhVien(lst);
		} else {
			System.out.println("\n\nInsert không thành công");
		}
	}

	static void inDsSinhVien(List<SinhVien> lst) {
		for (int i = 0; i < lst.size(); i++) {
			var x = lst.get(i);
			System.out.printf("%7s %30s %10s %12s\n",
					x.getMaSinhVien(),
					x.getHoTen(),
					x.isGioiTinhNam(),
					convertToString(x.getNgaySinh())
			);
		}
	}
	
	static Date convertToDate(String ymd) {
		var sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			return sdf.parse(ymd);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	static String convertToString(Date ngay) {
		var sdf = new SimpleDateFormat("yyyy/MM/dd");
		return ngay == null ? "1900/01/01" : sdf.format(ngay);
	}
}
