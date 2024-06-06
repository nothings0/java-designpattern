package _21T1020546;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SinhVienRepoSQL implements SinhVienRepo {
	Connection con = null;
	public SinhVienRepoSQL(String cnn) {
		// TODO Auto-generated constructor stub
		this.con = (DBHelper.getInstance(cnn)).getConnection();
	}
	
	@Override
	public List<SinhVien> selectAll() {
		List<SinhVien> lst = new ArrayList<>();
		Statement stmt;
		try {
			stmt = con.createStatement();
			String SQL = "SELECT MaSinhVien, HoTen, GioiTinhNam, NgaySinh FROM SinhVien";
			ResultSet rs = stmt.executeQuery(SQL);
			
			while (rs.next()) {
	            SinhVien sv = new SinhVien();
	            sv.setMaSinhVien(rs.getString("MaSinhVien"));
	            sv.setHoTen(rs.getString("HoTen"));
	            sv.setGioiTinh(rs.getByte("GioiTinhNam"));
	            sv.setNgaySinh(rs.getDate("NgaySinh"));
	            lst.add(sv);
	        }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}
	@Override
	public SinhVien insert(SinhVien x) {
	    String SQL = "INSERT INTO SinhVien (MaSinhVien, GioiTinhNam, NgaySinh, HoTen) VALUES (?, ?, ?, ?)";
	    try (PreparedStatement statement = con.prepareStatement(SQL)) {
	        
	        statement.setString(1, x.getMaSinhVien());
	        statement.setByte(2, x.getGioiTinh());
	        statement.setDate(3, x.getNgaySinh());
	        statement.setString(4, x.getHoTen());

	        
	        int rowsInserted = statement.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println("Dữ liệu đã được chèn thành công vào bảng.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return x;
	}

	@Override
	public void delete(String maSV) {
	    String SQL = "DELETE FROM SinhVien WHERE MaSinhVien = ?";
	    try (PreparedStatement statement = con.prepareStatement(SQL)) {
	        // Thiết lập tham số cho câu lệnh SQL
	        statement.setString(1, maSV);

	        // Thực thi câu lệnh SQL để xóa dữ liệu
	        int rowsDeleted = statement.executeUpdate();
	        if (rowsDeleted > 0) {
	            System.out.println("Dữ liệu đã được xóa thành công.");
	        } else {
	            System.out.println("Không tìm thấy sinh viên có mã: " + maSV);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}
