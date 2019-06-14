package org.Ctr;

import java.util.Scanner;

public class Grade {
public static void main(String[] args) {
	//int i=0,m1;
//	int mark1=10,m2=20,m3=15,m4=22,m5=30;
	//for(i=0;i<mark1;i++) {
		int m1=10,m2=20,m3=30,m4=45;
		//Scanner h=new Scanner(System.in);
		//int  m1,m2,m3,m4=h.nextInt();
		//for(i=0;i<mark;i++)
		
		if(m1>m2 && m1>m3 && m1>m4) {
			System.out.println("TAmil mark higitest");
	}
		else if(m2>m1 && m2>m3 && m3>m4) {
			System.out.println("ENglish mark high");
		}
		else if(m3>m1 && m3>m2 && m3>m4) {
			System.out.println("Hindi mark high");
			
		}
		else {
			System.out.println("science mark");
		}
	
	
}
}
