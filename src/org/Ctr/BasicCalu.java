package org.Ctr;

import java.util.Scanner;

public class BasicCalu {
	public static void main(String[] args) {
		/*
		 * switch(3) { case 1: System.out.println("1"); break; case 2:
		 * System.out.println("2"); break; default: System.out.println("in valid");
	
		 */
   	
	Scanner calu=new Scanner(System.in);
	System.out.println("Enter the Number");
	
	double one=calu.nextDouble();
	double two=calu.nextDouble();
	char opertor=calu.next().charAt(0);
	//char operator = reader.next().charAt(0);
	
	double result = 0;
	switch(opertor) {
	case '+':
		result=one+two;
		break;
		default:
			System.out.println("done");
	}
	 
    System.out.printf("%.1f %c %.1f = %.1f", one, opertor, two,result);
	}
}
