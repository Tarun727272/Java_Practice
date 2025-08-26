package com.prac_number;

import java.util.Scanner;

public class CountOddNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				count++;
			}
		}
		System.out.println("The odd number 1-100 is: "+count);
	}
}
