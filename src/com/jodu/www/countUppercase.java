package com.jodu.www;
import java.util.*;

public class countUppercase {
	public static void main (String[] args) {
		Scanner sin = new Scanner(System.in);
		String str;
		System.out.print("���ڿ��� �Է��ϼ���>>");
		int n = 0;
		try {
			while(true) {
				str = sin.nextLine();
				StringTokenizer st = new StringTokenizer(str);
				n += st.countTokens(); // �ܾ� ���� ����
			}
		}
		catch (NoSuchElementException e) { // ctrl-z �Է� �� �߻��ϴ� ����
			System.out.println("�ܾ��� ������ " + n); // ���� �ܾ� ���� ���
		} 
	}
}
