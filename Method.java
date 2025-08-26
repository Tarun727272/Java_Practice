package com.learn.day6;

import java.util.Scanner;

public class Method {
/*	Type-1--Not take input and no return type
	public static void main(String[] args) {
		learnMath();
	}
	public static void learnMath() {
		System.out.println("Learning with math");
	} */
	/*type-2
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		add(num1,num2);
	}
	public static void add(int a,int b) {
		int c=a+b;
		System.out.println("Sum of two number is: "+c);
	}*/
	/*Type-3
	  public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		
		double resDiv=div();
		System.out.println("Division of two number is: "+resDiv);
	}
	public static double div() {
		double a=20;
		double b=10;
		double c=a/b;
		return c;
		
	}*/
//	Type-4
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num: ");
		String num1=sc.next();
		System.out.println("Enter second num: ");
	    String num2=sc.next();
	    
	    System.out.println("Add two number of int : "+addNum(num1,num2));
	}
	public static int addNum(String a,String b) {
		int n1=Integer.parseInt(a);
		int n2=Integer.parseInt(b);
		return n1+n2;
	}
}
