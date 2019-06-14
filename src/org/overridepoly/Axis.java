package org.overridepoly;

public class Axis extends Bankinfo{
	
@Override
public void deposit(int id) {
	System.out.println("1"+id);
}
public static void main(String[] args) {
	Axis a1=new Axis();
	a1.deposit(1);
	a1.fixed();
	a1.saving();
}
}
