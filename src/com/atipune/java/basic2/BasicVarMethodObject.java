package com.atipune.java.basic2;

public class BasicVarMethodObject {
	int age=45;
	int total=0;
	
	void display(){
		System.out.println(age);
		System.out.println(total);
	}
	void addition() {
		total=age+50;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicVarMethodObject obj1=new BasicVarMethodObject();
		obj1.display();
		obj1.addition();
		obj1.age=65;
		obj1.addition();
		obj1.display();
		

	}

}
