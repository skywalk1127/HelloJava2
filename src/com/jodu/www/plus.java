package com.jodu.www;
import java.util.*;

public class plus {
	public static void main (String[] args) {
		Scanner sin = new Scanner(System.in);
		String str;
		System.out.print("���ڿ��� �Է��ϼ���>>");
		String longestWord = null;
		int len =0;
		try {
			while(true) {
				str = sin.nextLine();
				StringTokenizer st = new StringTokenizer(str);
				for (int i=0; i<st.countTokens(); i++) {
					len++;
					String token = st.nextToken();
					if (longestWord == null || token.length() > longestWord.length()) // ù �ܾ��̰ų� ���� �ܾ ���ݱ��� ���� �� �ܾ�� �� ���
						longestWord = token;
				}
			}
		}
		catch (NoSuchElementException e) { // ctrl-z �Է� �� �߻��ϴ� ����
			System.out.println("���� �� �ܾ�� " + longestWord + len); // ���� �ܾ� ���� ���
		} 
	}
}
