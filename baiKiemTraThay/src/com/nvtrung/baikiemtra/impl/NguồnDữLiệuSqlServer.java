package com.nvtrung.baikiemtra.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.nvtrung.baikiemtra.model.SinhVien;
import com.nvtrung.baikiemtra.services.NguồnDữLiệu;

public class NguồnDữLiệuSqlServer implements NguồnDữLiệu {
	private String chuỗiKếtNối;
	private Connection _cnnInstance = null;

	public NguồnDữLiệuSqlServer(String cnn) {
		this.chuỗiKếtNối = cnn;
	}

	private Connection getConnection() {
		if (_cnnInstance == null) {
			try {
				_cnnInstance = DriverManager.getConnection(this.chuỗiKếtNối);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		;

		return _cnnInstance;
	}

	@Override
	public List<SinhVien> selectAll() {
		var lst = new ArrayList<SinhVien>();

		try {
			// 1. khởi tạo kết nối đến nguồn dữ liệu
			Connection cnn = this.getConnection();

			// 2. tạo stmt
			Statement stmt = cnn.createStatement();

			// 3. thực thi stmt
			ResultSet rs = stmt.executeQuery("SELECT MaSinhVien, HoTen, GioiTinhNam, NgaySinh FROM SinhVien");

			// 4. render danh sách từ kết quả truy vấn stmt
			while (rs.next()) {
				var maSinhVien = rs.getString(1);
				var hoTen = rs.getString(2);
				var gioiTinhNam = rs.getBoolean(3);
				var ngaySinh = rs.getDate(4);

				var sv = new SinhVien(maSinhVien, hoTen, gioiTinhNam, ngaySinh);
				lst.add(sv);
			}

			// 5. giải phóng tài nguyên
			rs.close();
			stmt.close();
//			cnn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public boolean insert(SinhVien x) {
		try {
			// 1. khởi tạo kết nối đến nguồn dữ liệu
			Connection cnn = this.getConnection();

			// 2. tạo stmt
			Statement stmt = cnn.createStatement();

			// 3. thực thi stmt
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String ymdNgaySinh = sdf.format(x.getNgàySinh());
			String query = String.format(""
					+ "INSERT INTO SinhVien (MaSinhVien, HoTen, GioiTinhNam, NgaySinh) "
					+ "VALUES ('%s', N'%s', %d, '%s')",
					x.getMãSinhViên(),
					x.getHọTên(),
					x.isGiớiTínhNam() ? 1 : 0,
					ymdNgaySinh);
			int n = stmt.executeUpdate(query);

			// 4. giải phóng tài nguyên
			stmt.close();
//			cnn.close();

			return n > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(String mãSinhViên) {
		try {
			// 1. khởi tạo kết nối đến nguồn dữ liệu
			Connection cnn = this.getConnection();

			// 2. tạo stmt
			Statement stmt = cnn.createStatement();

			// 3. thực thi stmt
			String query = String.format("DELETE FROM SinhVien WHERE (MaSinhVien = '%s')", mãSinhViên);
			int n = stmt.executeUpdate(query);

			// 4. giải phóng tài nguyên
			stmt.close();
//			cnn.close();

			return n > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
