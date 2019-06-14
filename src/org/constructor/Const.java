package org.constructor;

public class Const {
	public  Const() {
		this(10);
	System.out.println("default");
	}
	public Const(int id) {
	this("asar");
		System.out.println("int para"+id);
	}
	public Const(String name)
	{ 
		
		System.out.println("enter   :"  + name);
	}
	public static void main(String[] args) {
		Const d= new Const();
		//Const g=new Const(10);
		
	}
	

}