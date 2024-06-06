package com.nvtrung.baikiemtra.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.nvtrung.baikiemtra.impl.NguồnDữLiệuSqlServer;
import com.nvtrung.baikiemtra.impl.NguồnDữLiệuVănBản;
import com.nvtrung.baikiemtra.model.CấuHình;
import com.nvtrung.baikiemtra.model.SinhVien;
import com.nvtrung.baikiemtra.services.NguồnDữLiệu;

public class ChuongTrinh {

	static String convertToString(Date ngay) {
		var sdf = new SimpleDateFormat("yyyy/MM/dd");
		return ngay == null ? "1900/01/01" : sdf.format(ngay);
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
	
	static void inDanhSachSinhVien(List<SinhVien> lst) {
		for (int i = 0; i < lst.size(); i++) {
			var x = lst.get(i);
			System.out.printf("%7s %30s %10s %12s\n", //
					x.getMãSinhViên(), //
					x.getHọTên(), //
					x.isGiớiTínhNam(), //
					convertToString(x.getNgàySinh()) //
			);
		}
	}

	static CấuHình getCấuHình() {
		CấuHình ch = new CấuHình();
		
		try {
			var fr = new FileReader("config.txt");
			var br = new BufferedReader(fr);
			String loạiNguồn = br.readLine();
			String chuỗiKếtNối = br.readLine();
			
			ch.setLoạiNguồn(loạiNguồn);
			ch.setChuỗiKếtNối(chuỗiKếtNối);
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return ch;
	}
	
	public static void main(String[] args) {
		var cfg = getCấuHình();
		
		NguồnDữLiệu ndl = null;	
		
		if (cfg.getLoạiNguồn().equals("TEXT_FILE"))
			ndl = new NguồnDữLiệuVănBản(cfg.getChuỗiKếtNối());
		else if (cfg.getLoạiNguồn().equals("MS_SQLSERVER"))
			ndl = new NguồnDữLiệuSqlServer(cfg.getChuỗiKếtNối());
		else {
			System.out.println("Chưa hỗ trợ loại nguồn " + cfg.getLoạiNguồn());
			return;
		}

		// 1. đọc danh sách sinh viên
		var lst = ndl.selectAll();
		System.out.println("DANH SÁCH SINH VIÊN");
		inDanhSachSinhVien(lst);

		// 2. insert sinh viên
		var nvtrung = new SinhVien("T1235", "Nguyễn", true, convertToDate("2000/12/30"));
		if (ndl.insert(nvtrung)) {
			System.out.println("\n\nĐã insert thành công");
			lst = ndl.selectAll();
			System.out.println("DANH SÁCH SINH VIÊN SAU KHI INSERT");
			inDanhSachSinhVien(lst);
		} else {
			System.out.println("\n\nInsert không thành công");
		}
		
		// 3. delete sinh viên
		if (ndl.delete("sv5")) {
			System.out.println("\n\nĐã delete thành công");
			lst = ndl.selectAll();
			System.out.println("DANH SÁCH SINH VIÊN	SAU KHI DELETE");
			inDanhSachSinhVien(lst);
		} else {
			System.out.println("\n\nDelete không thành công");
		}
	}

}
