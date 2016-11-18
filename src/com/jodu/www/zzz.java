package com.jodu.www;
import java.util.Scanner;

abstract class Calc {
	int a, b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract public int calculate();
}

class Add extends Calc {
	public int calculate() {
		return  a+b; 
	}
}
class Sub extends Calc {
	public int calculate() {
		return  a-b; 
	}
	
}
class Mul extends Calc {
	public int calculate() {
		return  a*b; 
	}
	
}
class Div extends Calc {
	public int calculate() {
		return  a/b; 
	}
}
public class zzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		char operator = sc.next().charAt(0);
		switch(operator) {
		case '+':
			Add add = new Add();
			add.setValue(number1, number2);
			System.out.println(add.calculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(number1,  number2);
			System.out.println(sub.calculate());
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(number1,  number2);
			System.out.println(mul.calculate());
			break;
		case '/':
			Div div = new Div();
			div.setValue(number1,  number2);
			System.out.println(div.calculate());
			break;
		default:
			System.out.println("제대로 적으시오!");
		}
	}
}