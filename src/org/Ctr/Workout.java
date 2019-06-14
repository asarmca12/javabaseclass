package org.Ctr;

import java.util.Scanner;

public class Workout {
	
		  public static void main(String[] args) {
			  Scanner s=new Scanner(System.in);
			  int i=s.nextInt();
		    for (int i1 = 1; i1 <= 10; i1++) {
		      if (i1 == 5) {
		 continue;
		      }

		      else if(i==10)
		    	  System.err.println("valied");
		    
		      else if(i1>=10)
		    	  System.err.println("not valid");
		      System.out.println(i1);
		      
		      
		     
		    }

		  }

		}



