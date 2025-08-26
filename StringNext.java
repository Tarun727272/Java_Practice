package com.learn.day6;

import java.util.Scanner;
public class StringNext {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		System.out.println("Number: "+num);
//		This is not working becouse before read the integer so it not working
//		by making use make one extra sc.nextLine();
		sc.nextLine();
		System.out.println("Enter string: ");
		String str=sc.nextLine();
		System.out.println("String: "+str);
	}
}
