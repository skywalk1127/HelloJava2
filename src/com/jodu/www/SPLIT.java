package com.jodu.www;
import java.util.*;

public class SPLIT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int count = 0;
		System.out.println("���ڿ��� �Է��Ͻÿ�");
		try {
			while(true) {
				str = sc.nextLine();
				StringTokenizer st = new StringTokenizer(str);
				count += st.countTokens(); 
			}
		}
		catch (NoSuchElementException e) { //ctrl -z�� ������ �� ������ �����ذ�
			System.out.println("�ܾ��� ������ " + count);
		}
	}
}
