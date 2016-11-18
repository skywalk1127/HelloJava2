package com.jodu.www;

class Rect {
	int width;
	int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Rect r) {
		if(width*height == r.width*r.height)
			return true;
		else
			return false;
	}
}
public class RectManager {
	public static void main(String[] args) {
		Rect a = new Rect(3,4);
		Rect b = new Rect(2,6);
		if(a.equals(b))
			System.out.println("면적이 같습니다");
		else
			System.out.println("면적이 다릅니다");
	}
}
