package com.jodu.www;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode()); //��Ʈ�������� �ؽ��ڵ�
		sb.append(" is pencil"); //��Ʈ������ �����̱�
		System.out.println(sb);
		System.out.println(sb.capacity()); //��Ʈ�� ������ ũ��
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
		System.out.println(sb.hashCode()); //�ؽ��ڵ尡 �����Ƿ� ���� ��ü�̴�.��Ʈ�� ��ü�� ���ڿ� ���� �� ���ο� ��ü�� �����Ǿ� �ؽ��ڵ尪�� �ٲ��
	}
}
