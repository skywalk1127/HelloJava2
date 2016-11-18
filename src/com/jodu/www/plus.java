package com.jodu.www;
import java.util.*;

public class plus {
	public static void main (String[] args) {
		Scanner sin = new Scanner(System.in);
		String str;
		System.out.print("문자열을 입력하세요>>");
		String longestWord = null;
		int len =0;
		try {
			while(true) {
				str = sin.nextLine();
				StringTokenizer st = new StringTokenizer(str);
				for (int i=0; i<st.countTokens(); i++) {
					len++;
					String token = st.nextToken();
					if (longestWord == null || token.length() > longestWord.length()) // 첫 단어이거나 현재 단어가 지금까지 가장 긴 단어보다 긴 경우
						longestWord = token;
				}
			}
		}
		catch (NoSuchElementException e) { // ctrl-z 입력 시 발생하는 예외
			System.out.println("가장 긴 단어는 " + longestWord + len); // 누적 단어 갯수 출력
		} 
	}
}
