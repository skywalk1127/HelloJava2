package com.jodu.www;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(10);
		v.add(5);
		v.add(new Integer(4));
		v.add(new Integer(-1));
		
		v.add(2,100); //4와-1사이에 정수 100삽입
		
		System.out.println("백터 내의 요소 객체 수: " + v.size()); //size()는 백터 내의 요소 객체 수를 알 수 있다
		System.out.println("백터의 현재 용량 : " + v.capacity());// capacity()는 백터의 용량을 알 수 있다
		
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.print(n + " ");
		}
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println();
		System.out.println("백터 내의 정수 합은 : " + sum);
	}
}
