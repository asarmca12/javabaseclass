package org.fullyabstr;

public class Impley implements Rbibank {

	@Override
	public void saving() {
		System.out.println("7.5%");
		
	}

	@Override
	public void deposit() {
		System.out.println("7%");
		
	}

	@Override
	public void currentaccount() {
		System.out.println("3.5%");
	}

	@Override
	public void mf() {
	System.out.println("4%");
	}

	@Override
	public void fixed() {
		System.out.println("9%");	
	}
	
public static void main(String[] args) {
	Impley g=new Impley();
	g.saving();
	g.deposit();
	g.fixed();
	g.mf();
	g.currentaccount();
}
}