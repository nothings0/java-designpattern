package com.nhan.simplefactory.chuongtrinh;

import com.nhan.simplefactory.ui.ConVat;
import com.nhan.simplefactory.ui.ConVatFactory;
import com.nhan.simplefactory.ui.GaFactory;

public class ChuongTrinh {

	public static void main(String[] args) {
		
		
		ConVatFactory f = new GaFactory();
		ConVat x = f.getConVat();
		x.Keu();
	}

}
