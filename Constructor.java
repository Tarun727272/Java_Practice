package com.learn.day6;

public class Constructor {
	String name;
	int age;
	float sal;
	
	Constructor(String name,int age,float sal){
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	public static void main(String[] args) {
		Constructor st=new Constructor("Ram",45,4500.23f);
		
		System.out.println(st.name+" "+st.age+" "+st.sal);
	}
}
