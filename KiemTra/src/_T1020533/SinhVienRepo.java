package _T1020533;

import java.util.List;

public interface SinhVienRepo {
	public List<SinhVien> selectAll();
	public SinhVien insert(SinhVien x);
	public void delete(String maSV);
}
