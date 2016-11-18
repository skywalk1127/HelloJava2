package com.jodu.www;

public class MyPoint1 {
	private int a, b;
	public MyPoint1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public String toString() {
		return "MyPoint (" + a + "," + b +")";
	}
	public static void main(String[] args) {
		MyPoint1 a = new MyPoint1(3,20);
		System.out.println(a);
	}
}
