package com.jodu.www;
import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l) { //����Ʈ�� ��Ҹ� ��� ����ϴ� �޼ҵ�
		Iterator<String> it = l.iterator(); //Iterator ��ü ����
		while(it.hasNext()) { //it�� ��Ұ� ������ true ������ false
			String str = it.next(); //str�� ��Ұ��� �־� �ش�
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
		list.add("������");
		list.add("�����");
		list.add("�̵���");
		list.add("������");
		list.add("Ȳ����");
		
		Collections.sort(list); //��ҵ��� �����Ѵ�
		printList(list);
//		Collections.reverse(list); //��ҵ��� �Ųٷ� �����Ѵ�
//		printList(list);
		
		int index = Collections.binarySearch(list, "������") +1;
		System.out.println("��������" + index + "��° ����Դϴ�");
	}
}
