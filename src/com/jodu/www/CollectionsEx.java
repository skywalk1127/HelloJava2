package com.jodu.www;
import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l) { //리스트의 요소를 모두 출력하는 메소드
		Iterator<String> it = l.iterator(); //Iterator 객체 리턴
		while(it.hasNext()) { //it에 요소가 있으면 true 없으면 false
			String str = it.next(); //str에 요소값을 넣어 준다
			String separator;
			if(it.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(str + separator);
		}
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("조두현");
		list.add("김두현");
		list.add("이두현");
		list.add("문두현");
		list.add("황두현");
		
		Collections.sort(list); //요소들을 정렬한다
		printList(list);
//		Collections.reverse(list); //요소들을 거꾸로 정렬한다
//		printList(list);
		
		int index = Collections.binarySearch(list, "조두현") +1;
		System.out.println("조두현은" + index + "번째 요소입니다");
	}
}
