package com.learn.day4;

import java.util.Scanner;

public class ConversionFahrenheit {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fahrenheit: ");
		double fahrenheit=sc.nextDouble();
		
		double celsius=((5*(fahrenheit-32.0d))/9.0d);
		System.out.println(fahrenheit+" degree Fahrenheit is equal to "+celsius+" in Celsius");
		
	}
}
