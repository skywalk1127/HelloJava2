package com.jodu.www;

public class CColorPoint extends CPoint {
	private String c;
	public CColorPoint(int a, int b, String c) {
		super(a,b);
		this.c= c;
	}
	public String other() {
		return c;
	}
}
