package _21T1020546;

import java.util.List;

public class ChuongTrinh {
	private static String cnn = "jdbc:sqlserver://localhost;databaseName=BaiTap;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVienRepo repo = (new SinhVienRepoFactory(cnn)).createSinhVienRepo("MS_SQLSERVER");
		
		selectAll(repo);
//		insert(repo);
//		delete(repo);
	}
	public static void selectAll(SinhVienRepo repo) {
		List<SinhVien> lstSinhVien = repo.selectAll();
		for (SinhVien sinhVien : lstSinhVien) {
            System.out.println("Mã sinh viên: " + sinhVien.getMaSinhVien());
            System.out.println("Họ tên: " + sinhVien.getHoTen());
            System.out.println("Giới tính: " + sinhVien.getGioiTinh());
            System.out.println("Ngày sinh: " + sinhVien.getNgaySinh());
            System.out.println("---------------------------");
        }
	}
	
	public static void insert(SinhVienRepo repo) {
		SinhVien x = new SinhVien("10", "Nguyen Van A", (byte)1, java.sql.Date.valueOf("2000-01-01"));
		SinhVien y = repo.insert(x);
        System.out.println("Mã sinh viên: " + y.getMaSinhVien());
        System.out.println("Họ tên: " + y.getHoTen());
        System.out.println("Giới tính: " + y.getGioiTinh());
        System.out.println("Ngày sinh: " + y.getNgaySinh());
	}
	
	public static void delete(SinhVienRepo repo) {
		String maSV = "3";
		repo.delete(maSV);
	}
}
