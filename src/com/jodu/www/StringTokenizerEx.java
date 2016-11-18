package com.jodu.www;
import java.util.*;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "조=두현&김=두현&이=두현";
		StringTokenizer st = new StringTokenizer(str, "&");
		StringTokenizer st2 = new StringTokenizer(str, "&두");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		System.out.println(st.hashCode());
		System.out.println(st2.hashCode());
		int count = st.countTokens(); //토큰의 개수를 알수 있다 countTokens
		int count2 = st2.countTokens();
		System.out.println("토큰의 개수 : " +count);
		for(int i=0; i<count2; i++) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
//토큰의 출력은 한번 밖에 안되는 것을 예제에서 알 수 있다!!