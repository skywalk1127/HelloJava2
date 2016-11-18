package com.jodu.www;
import java.util.Scanner;
import java.io.*;

class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void getEnterKey() {
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			rd.read();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class RandomGame {
	public static void main(String[] args) {
		Person p, p1, p2;
		Scanner sc = new Scanner(System.in);
		int[] number= new int[3];
		System.out.print("���ӿ� ������ 1p �̸��� �����ÿ�>>");
		p1 = new Person(sc.nextLine());
		System.out.print("���ӿ� ������ 2p �̸��� �����ÿ�>>");
		p2 = new Person(sc.nextLine());
		p = p1;
		while(true) {
			System.out.println(p.getName() + "�����Դϴ�."+ "\n" +"���͸� �ļ� �������� 3���� ������ �ϼ���!" + "\n" +"�� �� ��");
			p.getEnterKey();
			for(int i=0; i<number.length; i++) {
				number[i] = (int)Math.round(Math.random()*3);
				System.out.print(number[i] + " ");
			}
			System.out.println();
			boolean result = true;
			for(int i=0; i<number.length; i++) {
				if(number[i] != number[0]) {
					result = false;
					break;
				}
			}
			if(result==true) {
				System.out.println(p.getName()+ "���� ���ӿ��� �̰���ϴ�!");
				break;
			}
			if(p == p1) //���� p�� p1�̸� p2��, p2�� p1���� �ٲ��ش�
				p = p2;
			else
				p =p1;
		}
		
		
	}
}
