// package com.learn.day02;
import java.util.Scanner;
public class DataType {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter byte: ");
		byte by=sc.nextByte();
		System.out.println("Enter short: ");
		short sh=sc.nextShort();
		System.out.println("Enter int: ");
		int in=sc.nextInt();
		System.out.println("Enter long: ");
		long lo=sc.nextLong();
		//Real no-->>float,long
		System.out.println("Enter float: ");
		float f=sc.nextFloat();
		System.out.println("Enter double: ");
		double dou=sc.nextDouble();
		System.out.println("Enter boolean: ");
		boolean boo=sc.nextBoolean();
		System.out.println("Enter char: ");
		char ch=sc.next().charAt(0);
		
		System.out.println(by);
		System.out.println(sh);
		System.out.println(in);
		System.out.println(lo);
		System.out.println(f);
		System.out.println(dou);
		System.out.println(boo);
		System.out.println(ch);
		
	}
}
