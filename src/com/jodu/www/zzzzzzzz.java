package com.jodu.www;
import java.util.Scanner;

public class zzzzzzzz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("yes(y) or no(n)>>");
		String inputVal = scan.nextLine();
		
		switch(inputVal) {
		case "y":
			System.out.println("y");
			break;
		case "Y":
			System.out.println("Y");
			break;
		case "n":
			System.out.println("n");
			break;
		case "N":
			System.out.println("N");
			break;
		}
	}
}
