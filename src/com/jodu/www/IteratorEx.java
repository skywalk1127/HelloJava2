package com.jodu.www;
import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(10);
		v.add(3);
		v.add(-10);
		Iterator<Integer> it = v.iterator();
		int sum =0;
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
			System.out.print(n + " ");
		}
		System.out.println("벡터의 모든 정수의 합 : " + sum);
	}
}
