package com.jodu.www;
import java.util.*;

public class SPLIT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int count = 0;
		System.out.println("문자열을 입력하시오");
		try {
			while(true) {
				str = sc.nextLine();
				StringTokenizer st = new StringTokenizer(str);
				count += st.countTokens(); 
			}
		}
		catch (NoSuchElementException e) { //ctrl -z를 눌렀을 때 나오는 오류해결
			System.out.println("단어의 개수는 " + count);
		}
	}
}
