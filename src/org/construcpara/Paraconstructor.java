package org.construcpara;

public class Paraconstructor {
public Paraconstructor() {
	this("green technology");
	
}
public Paraconstructor(int d) {
	//this (120);
	System.out.println(d);
}
public Paraconstructor(float a) {
	//System.out.println(a);
}


public Paraconstructor(String name) {
	this(12);
	System.out.println("chennai   "+name);
}






public static void main(String[] args) {
	Paraconstructor cc=new Paraconstructor();
}
}
