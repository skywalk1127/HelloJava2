package com.jodu.www;
import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> javascore = new HashMap<String, Integer>();
		javascore.put("조두현", 100);
		javascore.put("김두현", 95);
		javascore.put("이두현", 90);
		System.out.println("HashMap의 요소 개수 : " + javascore.size());
		
		Scanner sc =new Scanner(System.in);
		for(int i=0; i<javascore.size(); i++) {
			System.out.print("자바점수를 알고 싶은 이름을 적으시오>> ");
			String name = sc.next();
			System.out.println(javascore.get(name));
		}
		
		Set<String> keys = javascore.keySet(); //HashMap에 있는 모든 키를 담은 Set<k>컬렉션 리턴
		Iterator<String> it = keys.iterator(); //key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		while(it.hasNext()) {
			String name = it.next();         //다음키. 학생이름
			int score = javascore.get(name); //점수 알아내는 것
			System.out.println(name + " : " + score);
		}
	}
}
