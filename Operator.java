package com.learn.day3;
import java.util.Scanner;
public class Operator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int firstNum=sc.nextInt();
		System.out.println("Enter second number: ");
		int secondNum=sc.nextInt();
		System.out.println("Perform the Arithmetic operator: ");
		System.out.println("Sum of two number: "+(firstNum+secondNum));
		System.out.println("Subtraction of two number: "+(firstNum-secondNum));
		System.out.println("Multiplication of two number is: "+(firstNum*secondNum));
		System.out.println("Division of two number is: "+(firstNum/secondNum));
		System.out.println("Modulous of two number is: "+(firstNum%secondNum));
		System.out.println("Performing the Relational operator: ");
		System.out.println(firstNum>secondNum);
		System.out.println(firstNum<secondNum);
		System.out.println(firstNum>=secondNum);
		System.out.println(firstNum<=secondNum);
		System.out.println(firstNum!=secondNum);
		System.out.println(firstNum==secondNum);
	}
}
