package com.learn.day6;

import java.util.Scanner;

public class MethodOverloading {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three float value: ");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat(); 
		System.out.println("Enter three int value: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
//		Creating multiple method having same name inside same class
		add(a,b);
		add(a,b,c);
		add(a,x);
		add(x,y);
		add(x,y,z);
	}

	public static void add(float a, float b) {
		System.out.println(a+b);
	}
	public static void add(float a, float b,float c) {
		System.out.println(a+b+c);
	}
	public static void add(float a, int b) {
		System.out.println(a+b);
	}
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
}
