package org.Ctr;

import java.util.Scanner;

public class Calu {
public static void main(String[] args) {
	Scanner c1=new Scanner(System.in);
	System.out.println("enter the number");
	int a=c1.nextInt();
	System.out.println("enter the second number");
	int b=c1.nextInt();
	System.out.println("select ur opertor");
	System.out.println("addtion-a,sustration-s,multip-m");
	char ch=c1.next().charAt(0);
	switch(ch) {
	case'a':
		System.out.println("addtional value"+(a+b));
		break;
	case 's':
		System.out.println("sub"+(a-b));
		break;
	case 'm':
		System.out.println("multip"+(a*b));
		break;
		default:
			System.out.println("invalid action");
	}
}
}
