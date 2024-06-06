package com.nhan.factory.style2;

import com.nhan.factory.DongVatAnCo;
import com.nhan.factory.DongVatAnThit;
import com.nhan.factory.DongVatFactory;

public class FactoryStyle2 extends DongVatFactory{
	@Override
	public DongVatAnCo createDongVatAnCo() {
		// TODO Auto-generated method stub
		return new Soc();
	}
	@Override
	public DongVatAnThit createDongVatAnThit() {
		// TODO Auto-generated method stub
		return new Soi();
	}
}
