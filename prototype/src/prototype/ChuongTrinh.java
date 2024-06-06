package prototype;

import java.util.ArrayList;
import java.util.List;

public class ChuongTrinh {
	public static void main(String[] args) {
		List<SinhVien> lst1 = new ArrayList<>();

		lst1.add(new SinhVien("sv1", "Nguyễn Văn Trung"));
		lst1.add(new SinhVienNuocNgoai("sv2", "Trần Văn", "Công ty ABC"));
		lst1.add(new SinhVienNuocNgoai("sv3", "Lê Thị Hoa", "XYZ corppation"));
		lst1.add(new SinhVien("sv100", "John Smith"));
		
		System.out.println("\nTẠO BẢN SAO KIỂU 2");
		
		// Tạo bản sao
		List<SinhVien> lst2 = new ArrayList<>();
		for (int i = 0; i < lst1.size(); i++) {
				SinhVien x = lst1.get(i);
				lst2.add(x.taoBanSao());
		}

		// In danh sách bản sao
		for (int i = 0; i < lst2.size(); i++)
			System.out.println(lst2.get(i).toString());
//		System.out.println("\nTẠO BẢN SAO KIỂU 1");
//		// Tạo bản sao
//		List<SinhVien> lst2 = new ArrayList<>();
//		for (int i = 0; i < lst1.size(); i++) {
//				SinhVien x = lst1.get(i);
//				lst2.add(new SinhVien(x)); // bổ sung bản sao của x vào dsách đích
//		}
//
//		// In danh sách bản sao
//		for (int i = 0; i < lst2.size(); i++)
//				System.out.println(lst2.get(i).toString());
	}
}
