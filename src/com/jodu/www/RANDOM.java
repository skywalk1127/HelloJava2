package com.jodu.www;

public class RANDOM {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			double d = Math.random()*40+10;
			int rd = (int)Math.round(d);
			System.out.print(rd + " ");
		}
		System.out.println();
		for(int i=0; i<10; i++) {
			double d = Math.random();
			int rd = (int)(d*50)+1;
			System.out.print(rd + " ");
		}
	}
}
