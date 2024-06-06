package com.nvtrung.baikiemtra.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nvtrung.baikiemtra.model.SinhVien;
import com.nvtrung.baikiemtra.services.NguồnDữLiệu;

public class NguồnDữLiệuVănBản implements NguồnDữLiệu {
	private String filename;

	public NguồnDữLiệuVănBản(String filename) {
		this.filename = filename;
	}

	@Override
	public List<SinhVien> selectAll() {
		var lst = new ArrayList<SinhVien>();

		try {
			var fr = new FileReader(this.filename);
			var br = new BufferedReader(fr);

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;

				// phân tích line & render thành SinhVien
				var info = line.split("\\,");
				
				if (info.length == 4) {				
					var mãSinhViên = info[0];
					var họTên = info[1];
					var giớiTínhNam = info[2].toLowerCase().equals("true");
					var ngàySinh = convertYMD(info[3]);
	
					var sv = new SinhVien(mãSinhViên, họTên, giớiTínhNam, ngàySinh);
					lst.add(sv);
				}
			}

			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lst;
	}

	private Date convertYMD(String ymd) {
		var sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			return sdf.parse(ymd);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	private String convertToString(Date ngay) {
		var sdf = new SimpleDateFormat("yyyy/MM/dd");
		return ngay == null ? "1900/01/01" : sdf.format(ngay);
	}

	@Override
	public boolean insert(SinhVien x) {
		/*
		 * 1) Mở file "filename" dạng APPEND 
		 * 2) Chuyển x --> mãSV,họTên,gtNam,ymd 
		 * 3) Ghi dòng này vào file 
		 * 4) Đóng file lại
		 */
		try {
			// 1) Mở file "filename" dạng APPEND
			var fw = new FileWriter(this.filename, true);
			var bw = new BufferedWriter(fw);

			// 2) Chuyển x --> mãSV,họTên,gtNam,ymd
			String line = String.format("\n%s,%s,%s,%s", //
					x.getMãSinhViên(), //
					x.getHọTên(), //
					x.isGiớiTínhNam() ? "true" : "false", //
					convertToString(x.getNgàySinh()) //
			);

			// 3) Ghi vào file
			bw.write(line);

			// 4) Đóng file lại
			try {
				bw.close();
				fw.close();
			} catch (Exception ee) {
			}

			return true;
		} catch (IOException e) {
			System.out.println("Lỗi trong quá trình INSERT");
			e.printStackTrace();

			return false;
		}

	}

	@Override
	public boolean delete(String mãSinhViên) {
		/*
		 * var lst = selectAll();
		 * 
		 * mở file filename dạng OVERWRITE
		 * 
		 * foreach (SinhVien x : lst) 
		 * 		if (x.getMãSinhVien != mãSinhViên) { 
		 * 			String line =
		 * 			chuyển x thành chuỗi file.write(line) 
		 * }
		 * 
		 * đóng file
		 */
		
		var lst = this.selectAll();
		try {
			// 1) Mở file "filename" dạng OVERWRITE
			var fw = new FileWriter(this.filename, false);
			var bw = new BufferedWriter(fw);

			// 2) Với mỗi sinh viên x có mãSinhVien != mãSinhViên: 
			//		Chuyển x --> mãSV,họTên,gtNam,ymd
			// 		Ghi vào file
			for (SinhVien x: lst) {
				if (!x.getMãSinhViên().equalsIgnoreCase(mãSinhViên)) {
					String line = String.format("\n%s,%s,%s,%s", //
								x.getMãSinhViên(), //
								x.getHọTên(), //
								x.isGiớiTínhNam() ? "true" : "false", //
								convertToString(x.getNgàySinh()) //
							);
					bw.write(line);
				}
			}
			
			// 4) Đóng file lại
			try {
				bw.close();
				fw.close();
			} catch (Exception ee) {
				
			}
			return true;
			
		} catch (Exception e) {
			System.out.println("Lỗi trong quá trình DELETE");
			e.printStackTrace();

			return false;
		}
	}
}
