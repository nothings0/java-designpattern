package _T1020533;
import java.util.List;

public class ChuongTrinh {
	private static String connectionStr = "jdbc:sqlserver://localhost;databaseName=KiemTra;user=sa;password=123456;encrypt=true;trustServerCertificate=true";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVienRepo repo = (new SinhVienRepoFactory(connectionStr)).createSinhVienRepo("MS_SQLSERVER");
		
		selectAll(repo);
//		insert(repo);
//		delete(repo);
	}
	public static void selectAll(SinhVienRepo repo) {
		List<SinhVien> lstSinhVien = repo.selectAll();
		for (SinhVien sinhVien : lstSinhVien) {
			System.out.println("--------------------");
            System.out.println("Ma sinh vien: " + sinhVien.getMaSinhVien());
            System.out.println("Ho ten: " + sinhVien.getHoTen());
            System.out.println("Gioi tinh: " + sinhVien.getGioiTinh());
            System.out.println("Ngay sinh: " + sinhVien.getNgaySinh());
        }
	}
	
	public static void insert(SinhVienRepo repo) {
		SinhVien sinhVien = new SinhVien("T1020855", "Nguyen thi n", (byte)1, java.sql.Date.valueOf("2003-05-08"));
		SinhVien svResp = repo.insert(sinhVien);
		System.out.println("--------------------");
		System.out.println("Ma sinh vien: " + svResp.getMaSinhVien());
        System.out.println("Ho ten: " + svResp.getHoTen());
        System.out.println("Gioi tinh: " + svResp.getGioiTinh());
        System.out.println("Ngay sinh: " + svResp.getNgaySinh());
	}
	
	public static void delete(SinhVienRepo repo) {
		String maSV = "T1020555";
		repo.delete(maSV);
	}
}
