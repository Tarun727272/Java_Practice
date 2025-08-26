package com.learn.day4;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int digit=0,sum=0;
		
//		While loop
		while(num>0) {
			//find last digit
			digit=num%10;
			//update the value in sum
			sum+=digit;
			//remove the last digit
			num/=10;
			
		}
		
		System.out.println("Sum of digits: "+sum);
	}
}
