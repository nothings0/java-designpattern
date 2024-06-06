package _21T1020546;

import java.sql.SQLException;
import java.util.List;

public class ChuongTrinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		try {
			GetSinhVien();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public static void GetSinhVien () throws SQLException {
		SinhVienDAO daoSinhVien = new SinhVienDAO();
		List<SinhVien> lstSinhVien = daoSinhVien.getSinhVienList();
		for (SinhVien sinhVien : lstSinhVien) {
            System.out.println("Mã sinh viên: " + sinhVien.getMaSinhVien());
            System.out.println("Họ tên: " + sinhVien.getHoTen());
            System.out.println("Giới tính: " + sinhVien.getGioiTinh());
            System.out.println("Ngày sinh: " + sinhVien.getNgaySinh());
            System.out.println("---------------------------");
        }
	}

}
