package com.jodu.www;

public class CPointManager {
	public static void main(String[] atgs) {
		CPoint a,b;
		a= new CPoint(2,3);
		b= new CColorPoint(3,4,"red");
		a.show();
		b.show();
		System.out.println(a);
		System.out.println(b);
	}
}
