package _21T1020546;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SinhVienDAO {	
    public List<SinhVien> getSinhVienList() throws SQLException {					
			
			String connectionUrl = "jdbc:sqlserver://localhost;databaseName=BaiTap;user=sa;password=123456";
			Connection con = DriverManager.getConnection(connectionUrl);
				 
			
			Statement stmt = con.createStatement();
			String SQL = "SELECT * FROM SinhVien";
				
			
			ResultSet rs = stmt.executeQuery(SQL);
	
			
			List<SinhVien> lst = new ArrayList<>();;
			try {
		        // Duyệt qua từng dòng kết quả
		        while (rs.next()) {
		            // Tạo một đối tượng SinhVien từ dữ liệu trong kết quả
		            SinhVien sv = new SinhVien();
		            sv.setMaSinhVien(rs.getString("maSV"));
		            sv.setHoTen(rs.getString("hoTen"));
		            sv.setGioiTinh(rs.getString("gioiTinh"));
		            sv.setNgaySinh(rs.getDate("ngaySinh"));
		            
		            // Thêm đối tượng SinhVien vào danh sách
		            lst.add(sv);
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        // Đóng ResultSet và Connection
		        rs.close();
		        con.close();
		    }
		    
		    // Trả về danh sách sinh viên đã tạo
		    return lst;
    }
	public void insertSinhVien(SinhVien x) {
		///
	}
}