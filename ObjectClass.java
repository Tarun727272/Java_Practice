package com.learn.day6;

public class ObjectClass {
//	If we are not provide value then JVM provide default value
	String name;
	int roll_no;
	int age;
	float sal;
	public void work() {
		System.out.println("Working");
		
	}
	void study() {
		System.out.println("Studying");
	}
	public static void main(String[] args) {
		ObjectClass oc=new ObjectClass();
		System.out.println(oc.name+" "+oc.age+" "+oc.sal+" "+oc.roll_no);
		oc.work();
		oc.study();
		
	}
}
