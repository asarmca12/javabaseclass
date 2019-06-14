package org.Ctr;

import java.util.Scanner;

public class Elseiff {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	
int i=s.nextInt();
if(i==10)
	System.out.println("i is present value 10");
	
	else if(i==20)
	System.out.println("i is present value 20");
	else if(i==25)
	System.out.println("i is present value 25");
	else if(i>=26) 
		System.out.println("i is a not present value");
	else
		System.out.println("i is a present value");
	
	}
}
