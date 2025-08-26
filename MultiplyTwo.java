package com.learn.day9;
import java.util.Scanner;
public class MultiplyTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		float num1=sc.nextFloat();
		System.out.println("Enter num2: ");
		float num2=sc.nextFloat();
		float mul=num1*num2;
		System.out.println("Multiply of two number is: "+mul);
		
	}
}
