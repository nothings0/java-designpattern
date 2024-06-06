package com.nhan.module;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component{

	private String name;
	private List<Component> listItem = new ArrayList<Component>();
	
	public Folder(String name, List<Component> listItem) {
		super();
		this.name = name;
		this.listItem = listItem;
	}

	@Override
	public long getTotalSize() {
		long kq = 0;
		for (Component x : this.listItem)
				kq += x.getTotalSize();
		return kq;
	}
	
}
