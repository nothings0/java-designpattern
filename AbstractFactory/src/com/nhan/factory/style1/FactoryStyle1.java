package com.nhan.factory.style1;

import com.nhan.factory.DongVatAnCo;
import com.nhan.factory.DongVatAnThit;
import com.nhan.factory.DongVatFactory;

public class FactoryStyle1 extends DongVatFactory{
	
	public FactoryStyle1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public DongVatAnCo createDongVatAnCo() {
		return new NguaVan();
	}
	@Override
	public DongVatAnThit createDongVatAnThit() {
		// TODO Auto-generated method stub
		return new SuTu();
	}
}
