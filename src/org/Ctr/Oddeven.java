package org.Ctr;

import java.util.Scanner;

public class Oddeven {
	public static void main(String[] args) {
		
	
	int c;
   System.out.println("Input an integer");
	{
    Scanner in = new Scanner(System.in);
  
    c = in.nextInt();
   
    if ((c/2)*2 == c)
      System.out.println("Even");
    else
      System.out.println("Odd");
}
}
}
