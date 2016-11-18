package com.jodu.www;
import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> javascore = new HashMap<String, Integer>();
		javascore.put("������", 100);
		javascore.put("�����", 95);
		javascore.put("�̵���", 90);
		System.out.println("HashMap�� ��� ���� : " + javascore.size());
		
		Scanner sc =new Scanner(System.in);
		for(int i=0; i<javascore.size(); i++) {
			System.out.print("�ڹ������� �˰� ���� �̸��� �����ÿ�>> ");
			String name = sc.next();
			System.out.println(javascore.get(name));
		}
		
		Set<String> keys = javascore.keySet(); //HashMap�� �ִ� ��� Ű�� ���� Set<k>�÷��� ����
		Iterator<String> it = keys.iterator(); //key ���ڿ��� ������� ������ �� �ִ� Iterator ����
		while(it.hasNext()) {
			String name = it.next();         //����Ű. �л��̸�
			int score = javascore.get(name); //���� �˾Ƴ��� ��
			System.out.println(name + " : " + score);
		}
	}
}
