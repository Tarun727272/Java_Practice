package com.learn.day3;

import java.util.Scanner;

public class PrimitiveDataType {
	public static void main(String[] args) {
		//Manually
		byte byteType=21;
		short shortType=45;
		int intType=45789;
		long longType=45789166131456L;
		float floatType=45.56f;
		double doubleType=45789.4578926465d;
		char charType='d';
		boolean boolType=false;
		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType);
		System.out.println(boolType);
		System.out.println(charType);
		//By taking user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter byte type: ");
		byte by=sc.nextByte();
		System.out.println("Enter short type value: ");
		short sh=sc.nextShort();
		System.out.println("Enter integer type value: ");
		int in=sc.nextInt();
		System.out.println("Enter long type value: ");
		long lo=sc.nextLong();
		System.out.println("Enter float type value: ");
		float fl=sc.nextFloat();
		System.out.println("Enter double type value: ");
		double dou=sc.nextDouble();
		System.out.println("Enter charcater type value: ");
		char ch=sc.next().charAt(0);
		System.out.println("Enter boolean values: ");
		boolean bool=sc.nextBoolean();
		System.out.println("Byte values: "+by);
		System.out.println("Short values: "+sh);
		System.out.println("Integer values: "+in);
		System.out.println("Long values: "+lo);
		System.out.println("Floating point type: "+fl);
		System.out.println("Double point: "+dou);
		System.out.println("Character type values: "+ch);
		System.out.println("Boolean type values: "+bool);
	}
}
