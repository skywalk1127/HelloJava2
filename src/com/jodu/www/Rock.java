package com.jodu.www;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1:���� 2:���� 3:�� �ϳ��� �����ÿ�" + "\n" + "������   : ");
			int user = sc.nextInt(); //������ ���� �ϳ��� ���´�
			double d = Math.random()*2+1;
			int computer = (int)Math.round(d); //��ǻ�ʹ� �������� 1,2,3�� �̾Ƴ���
			int sum = user - computer;
			if(sum == 0)
				System.out.println("��ǻ�ʹ� : "+ computer + "\n" +"�����ϴ�");
			if(sum == 1)
				System.out.println("��ǻ�ʹ� : " + computer + "\n" +"�������̰���ϴ�");
			if(sum == -1)
				System.out.println("��ǻ�ʹ� : " + computer + "\n" +"��ǻ�Ͱ��̰���ϴ�");
			if(sum == 2)
				System.out.println("��ǻ�ʹ� : " + computer + "\n" +"��ǻ�Ͱ��̰���ϴ�");
			if(sum == -2)
				System.out.println("��ǻ�ʹ� : " + computer + "\n" +"�������̰���ϴ�");
					
		}
	}
}
