package org.construcpara;

public class Construtor {
	public Construtor() {
	this(120);
		System.out.println("default coustore check");
	}
public Construtor(int r) {
	//this("12F");
	System.out.println("int para constructor"+r);
}
public void Construtor() {
System.out.println("method checkinhg");

}
public static void main(String[] args) {
//	//Construtor m=new Construtor();
	Construtor m1=new Construtor(10);
	m1.Construtor();
//	Const1 jk=new Const1();
}
}
