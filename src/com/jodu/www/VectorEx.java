package com.jodu.www;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(10);
		v.add(5);
		v.add(new Integer(4));
		v.add(new Integer(-1));
		
		v.add(2,100); //4��-1���̿� ���� 100����
		
		System.out.println("���� ���� ��� ��ü ��: " + v.size()); //size()�� ���� ���� ��� ��ü ���� �� �� �ִ�
		System.out.println("������ ���� �뷮 : " + v.capacity());// capacity()�� ������ �뷮�� �� �� �ִ�
		
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.print(n + " ");
		}
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println();
		System.out.println("���� ���� ���� ���� : " + sum);
	}
}
