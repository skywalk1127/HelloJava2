package com.jodu.www;

public class CPoint {
	private int a, b;
	public CPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public String other() {
		return "";
	}
	public void show() {
		System.out.println("("+ a + "," + b + ")" + other());
	}
	public String toString() {
		return "("+a+","+b+")"+"¿‘¥œ¥Ÿ";
	}
}
