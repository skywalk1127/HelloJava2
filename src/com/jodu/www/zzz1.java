package com.jodu.www;
import java.util.*;

public class zzz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1:����, 2:����, 3:�� 4:exit" + "\n" + "����   : ");
			int user = sc.nextInt();
			if(user == 4) {
				System.out.println("������ �����մϴ�");
				break;
			}
			int computer = (int)Math.random()*3+1;
			int sum = user - computer;
			if(sum == 0) System.out.println("��ǻ�� : "+ computer + " �����ϴ�");
			if(sum == 1) System.out.println("��ǻ�� : "+ computer + " ������ �̰���ϴ�");
			if(sum == -1) System.out.println("��ǻ�� : "+ computer + " ��ǻ�Ͱ� �̰���ϴ�");
			if(sum == 2) System.out.println("��ǻ�� : "+ computer + " ��ǻ�Ͱ� �̰���ϴ�");
			if(sum == -2) System.out.println("��ǻ�� : "+ computer + " ������ �̰���ϴ�");
		}
	}
}
