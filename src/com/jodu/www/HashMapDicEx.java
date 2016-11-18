package com.jodu.www;
import java.util.*;

public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		dic.put("baby", "아기");
		Set<String> keys = dic.keySet();  //key 문자열을 가진 집합 Set 컬렉션 리턴
		Iterator<String> it = keys.iterator(); //key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		while(it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("찾고 싶은 단어는 무엇인가요?");
			String word = sc.next();
			System.out.println(dic.get(word));
		}
	}
}
