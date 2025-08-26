package com.learn.day3;
import java.util.Scanner;
public class CreatingVariable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.println("Enter second number: ");
		int secNum=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter user name: ");
		String userName=sc.nextLine();
		System.out.print(num+" "+secNum+" "+userName);
	}
}
