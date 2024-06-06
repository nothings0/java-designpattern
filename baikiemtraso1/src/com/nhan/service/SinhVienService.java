package com.nhan.service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.nhan.dbconnect.DbConnection;
import com.nhan.model.SinhVien;

public class SinhVienService implements ISinhVienService{
	private ArrayList<SinhVien> cacheSinhVien = null;
	private DbConnection _dbconnect;
	
	public SinhVienService (DbConnection dbconnect) {
		this._dbconnect = dbconnect;
	}
	
	@Override
	public List<SinhVien> selectAll() {
		if (cacheSinhVien != null) {
			return cacheSinhVien;
		}
		var lst = new ArrayList<SinhVien>();

		try {
			Connection cnn = this._dbconnect.getConnection();

			Statement stmt = cnn.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT MaSinhVien, HoTen, GioiTinhNam, NgaySinh FROM SinhVien");

			while (rs.next()) {
				var maSinhVien = rs.getString(1);
				var hoTen = rs.getString(2);
				var gioiTinhNam = rs.getBoolean(3);
				var ngaySinh = rs.getDate(4);

				var sv = new SinhVien(maSinhVien, hoTen, gioiTinhNam, ngaySinh);
				lst.add(sv);
			}

			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		cacheSinhVien = lst;
		return lst;
	}
	
	@Override
	public boolean insert(SinhVien x) {
		try {
			Connection cnn = this._dbconnect.getConnection();
			Statement stmt = cnn.createStatement();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String ymdNgaySinh = sdf.format(x.getNgaySinh());
			String query = String.format(""
					+ "INSERT INTO SinhVien (MaSinhVien, HoTen, GioiTinhNam, NgaySinh) "
					+ "VALUES ('%s', N'%s', %d, '%s')",
					x.getMaSinhVien(),
					x.getHoTen(),
					x.isGioiTinhNam() ? 1 : 0,
					ymdNgaySinh);
			int n = stmt.executeUpdate(query);
			stmt.close();
			cacheSinhVien = null;
			return n > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
