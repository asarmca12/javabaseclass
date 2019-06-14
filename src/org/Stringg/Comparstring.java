package org.Stringg;

public class Comparstring {
	public static void main(String[] args) {
		String a="Green technology";
		String b=" Chennai";
		
		boolean c=a.equals(b);
		System.out.println(c);
		
		boolean d=a.equalsIgnoreCase(b);
		System.out.println(d);
		String m=a.concat(b);
		System.out.println(m);
		String g="2"; 
		
		boolean k=g.isEmpty();
		System.out.println(k);
		String l[]=a.split("n");
	System.out.println(l[0]);
	System.out.println(l[1]);
	String o=a.substring(2);
	System.out.println(o);
	String o1=a.substring(0, 14);
	System.out.println(o1);
	String g1[]=a.split("");
//	int i=0;
//	for(int i=0;i<g1.length;i++) {
//		System.out.println(g1[i]);
//	}
	
	
	}

}
