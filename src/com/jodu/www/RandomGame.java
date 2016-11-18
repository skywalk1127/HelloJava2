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
		System.out.print("게임에 참여할 1p 이름을 적으시오>>");
		p1 = new Person(sc.nextLine());
		System.out.print("게임에 참여할 2p 이름을 적으시오>>");
		p2 = new Person(sc.nextLine());
		p = p1;
		while(true) {
			System.out.println(p.getName() + "차례입니다."+ "\n" +"엔터를 쳐서 랜덤숫자 3개를 나오게 하세요!" + "\n" +"↓ ↓ ↓");
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
				System.out.println(p.getName()+ "님이 게임에서 이겼습니다!");
				break;
			}
			if(p == p1) //현재 p가 p1이면 p2로, p2면 p1으로 바꿔준다
				p = p2;
			else
				p =p1;
		}
		
		
	}
}
