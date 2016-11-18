package com.jodu.www;
import java.util.*;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "��=����&��=����&��=����";
		StringTokenizer st = new StringTokenizer(str, "&");
		StringTokenizer st2 = new StringTokenizer(str, "&��");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		System.out.println(st.hashCode());
		System.out.println(st2.hashCode());
		int count = st.countTokens(); //��ū�� ������ �˼� �ִ� countTokens
		int count2 = st2.countTokens();
		System.out.println("��ū�� ���� : " +count);
		for(int i=0; i<count2; i++) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
//��ū�� ����� �ѹ� �ۿ� �ȵǴ� ���� �������� �� �� �ִ�!!