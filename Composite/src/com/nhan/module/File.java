package com.nhan.module;

public class File implements Component{

	private String name;
	private long size;
	
	public File(String name, long size) {
		super();
		this.name = name;
		this.size = size;
	}

	@Override
	public long getTotalSize() {
		// TODO Auto-generated method stub
		return this.size;
	}
	
}
