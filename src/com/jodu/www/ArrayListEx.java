package com.jodu.www;
import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int longname =0;
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요! 제일 긴 이름을 출력해드립니다!>> ");
			String str = sc.next();
			a.add(str);
		}
		for(int i=0; i<a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		for(int i=0; i<a.size(); i++) {
			if(a.get(0).length() < a.get(i).length()) {
				longname = i;
			}
		}
		System.out.println();
		System.out.println("제일 긴 이름은 : " + a.get(longname));
	}
}
