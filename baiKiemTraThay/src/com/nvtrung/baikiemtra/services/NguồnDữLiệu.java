package com.nvtrung.baikiemtra.services;

import java.util.List;

import com.nvtrung.baikiemtra.model.SinhVien;

public interface NguồnDữLiệu {
	List<SinhVien> selectAll();

	boolean insert(SinhVien x);

	boolean delete(String mãSinhViên);
}
