package com.jodu.www;
import java.util.*;

public class zzz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1:가위, 2:바위, 3:보 4:exit" + "\n" + "유저   : ");
			int user = sc.nextInt();
			if(user == 4) {
				System.out.println("게임을 종료합니다");
				break;
			}
			int computer = (int)Math.random()*3+1;
			int sum = user - computer;
			if(sum == 0) System.out.println("컴퓨터 : "+ computer + " 비겼습니다");
			if(sum == 1) System.out.println("컴퓨터 : "+ computer + " 유저가 이겼습니다");
			if(sum == -1) System.out.println("컴퓨터 : "+ computer + " 컴퓨터가 이겼습니다");
			if(sum == 2) System.out.println("컴퓨터 : "+ computer + " 컴퓨터가 이겼습니다");
			if(sum == -2) System.out.println("컴퓨터 : "+ computer + " 유저가 이겼습니다");
		}
	}
}
