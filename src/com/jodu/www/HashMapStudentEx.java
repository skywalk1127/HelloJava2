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
		phone.put("조두현", new Student(1, "010-8489-1127"));
		phone.put("김두현", new Student(2, "010-1234-5678"));
		phone.put("이두현", new Student(3, "010-9876-5432"));
		Set<String> keys = phone.keySet();
		Iterator<String> it = keys.iterator(); //접근할 수 있게 한다
		while(it.hasNext()) {
			String str = it.next(); //str은 HashMap에 있는 키이다
			Student student = phone.get(str); //student은 str의 값이다
			System.out.println(str + " : " + student.id + " " + student.tel);
		}
	}
}
