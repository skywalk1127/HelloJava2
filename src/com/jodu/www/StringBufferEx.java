package com.jodu.www;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode()); //스트링버퍼의 해시코드
		sb.append(" is pencil"); //스트링버퍼 덧붙이기
		System.out.println(sb);
		System.out.println(sb.capacity()); //스트링 버퍼의 크기
		sb.delete(0, 5);
		System.out.println(sb);
		char c = sb.charAt(0);
		System.out.println(c);
		sb.insert(0, "This is ");
		System.out.println(sb);
		sb.replace(0, 5, "zzz");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.setLength(4);
		System.out.println(sb);
		System.out.println(sb.hashCode()); //해시코드가 같으므로 같은 객체이다.스트링 객체는 문자열 조작 후 새로운 객체가 생성되어 해시코드값이 바뀐다
	}
}
