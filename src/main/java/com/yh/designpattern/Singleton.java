package com.yh.designpattern;

public class Singleton {
	private static Singleton instance;
	private int data;
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
