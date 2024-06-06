package com.nvtrung.baikiemtra.model;

import java.util.Date;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class SinhVien {
	private String mãSinhViên;
	private String họTên;
	private boolean giớiTínhNam;
	private Date ngàySinh;
}
