package org.Scanner;

//import java.time.LocalTime;
import java.util.Scanner;

public class Scan {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
//LocalTime time=LocalTime.now();
//System.out.println(time);

int stdid=s.nextInt();
System.out.println("enter id is"+stdid);
System.out.println("Enter the Name");
String stdname=s.next();
System.out.println("  Enter the Name  " + stdname);
//char c[]= {'a','m','f'};
//String s1=new String(c);
int mark1=s.nextInt();
System.out.println("Tamil Mark is"+mark1);
int mark2=s.nextInt();
System.out.println("English Mark is"+mark2);
int mark3=s.nextInt();
System.out.println("Hindi Mark is"+mark3);
int i=mark1+mark2+mark3;
System.out.println("Total Mark is :"+ i);
//float sum=0;
float percentage;
percentage =( i/300)*100;
System.out.print("\nPercentage = " +i+ "%");

float f=123.4f;
System.out.println(+f);
}
}
