package com.jodu.www;

public class Cricle {
	private int x, y, radius;
	public Cricle(int x, int y, int radius) {
		this.x=x; this.y=y; this.radius=radius;
	}
	public boolean equals(Object obj) {
		Cricle c = (Cricle)obj;
		if(radius == c.radius)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Cricle a = new Cricle(1,2,4);
		Cricle b = new Cricle(4,2,4);
		if(a.equals(b))
			System.out.println("두 Cricle객체는 동일하다.");
		else
			System.out.println("두 Cricle객체는 동일하지 않다.");
	}
}
