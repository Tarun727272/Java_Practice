package com.learn.day4;

import java.util.Scanner;

public class InchesToMetre {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of inches: ");
		float inch=sc.nextFloat();
		float metre=inch*0.0254f;
		System.out.println(inch+" inches in metre value is: "+metre+" m");
	}
}
