package com.jodu.www;
import java.util.*;

public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("love", "���");
		dic.put("apple", "���");
		dic.put("baby", "�Ʊ�");
		Set<String> keys = dic.keySet();  //key ���ڿ��� ���� ���� Set �÷��� ����
		Iterator<String> it = keys.iterator(); //key ���ڿ��� ������� ������ �� �ִ� Iterator ����
		while(it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("ã�� ���� �ܾ�� �����ΰ���?");
			String word = sc.next();
			System.out.println(dic.get(word));
		}
	}
}
