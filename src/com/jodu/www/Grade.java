package com.jodu.www;
import java.util.*;

public class Grade {
	public static void main(String[] args) {
		String str = "Name=kitae&Score=a&Course=cpp";
		StringTokenizer grade = new StringTokenizer(str, "=&");
		while(grade.hasMoreTokens()) {
			System.out.print(grade.nextToken()+ "\t");
			System.out.println(grade.nextToken("=&"));
		}
	}
}
