package com.nhan.service;
import java.util.List;
import com.nhan.model.SinhVien;
public interface ISinhVienService {
	List<SinhVien> selectAll();

	boolean insert(SinhVien x);
}
