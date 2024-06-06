package com.nhan.ui;

import com.nhan.factory.DongVatAnCo;
import com.nhan.factory.DongVatAnThit;
import com.nhan.factory.DongVatFactory;
import com.nhan.factory.style1.FactoryStyle1;
import com.nhan.factory.style2.FactoryStyle2;

public class ChuongTrinh {
	public static void main(String[] args) {
		DongVatAnThit x;
		DongVatAnCo z;
		DongVatFactory f = new FactoryStyle1();
		x = f.createDongVatAnThit();
		x.duoi();
		DongVatFactory y = new FactoryStyle2();
		z = y.createDongVatAnCo();
		z.boChay();
	}
}
