package com.jodu.www;
import java.util.*;

class Student {
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id; this.tel = tel;
	}
}
public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, Student> phone = new HashMap<String, Student>();
		phone.put("������", new Student(1, "010-8489-1127"));
		phone.put("�����", new Student(2, "010-1234-5678"));
		phone.put("�̵���", new Student(3, "010-9876-5432"));
		Set<String> keys = phone.keySet();
		Iterator<String> it = keys.iterator(); //������ �� �ְ� �Ѵ�
		while(it.hasNext()) {
			String str = it.next(); //str�� HashMap�� �ִ� Ű�̴�
			Student student = phone.get(str); //student�� str�� ���̴�
			System.out.println(str + " : " + student.id + " " + student.tel);
		}
	}
}
