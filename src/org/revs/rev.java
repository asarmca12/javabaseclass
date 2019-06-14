package org.revs;

import java.util.Scanner;

public class rev {
public static void main(String[] args) {
	System.out.println("enter they String");
Scanner re=new Scanner(System.in);
String d=re.nextLine();

StringBuilder jk=new StringBuilder(d);
System.out.println(jk.reverse().toString());

}
}

