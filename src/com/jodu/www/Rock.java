package com.jodu.www;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1:가위 2:바위 3:보 하나를 적으시오" + "\n" + "유저는   : ");
			int user = sc.nextInt(); //유저가 숫자 하나를 적는다
			double d = Math.random()*2+1;
			int computer = (int)Math.round(d); //컴퓨터는 무작위로 1,2,3을 뽑아낸다
			int sum = user - computer;
			if(sum == 0)
				System.out.println("컴퓨터는 : "+ computer + "\n" +"비겼습니다");
			if(sum == 1)
				System.out.println("컴퓨터는 : " + computer + "\n" +"유저가이겼습니다");
			if(sum == -1)
				System.out.println("컴퓨터는 : " + computer + "\n" +"컴퓨터가이겼습니다");
			if(sum == 2)
				System.out.println("컴퓨터는 : " + computer + "\n" +"컴퓨터가이겼습니다");
			if(sum == -2)
				System.out.println("컴퓨터는 : " + computer + "\n" +"유저가이겼습니다");
					
		}
	}
}
