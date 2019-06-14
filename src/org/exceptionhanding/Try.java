package org.exceptionhanding;

public class Try {
	public static void main(String[] args) {
		System.out.println(0);
System.out.println(1);
System.out.println(2);
System.out.println(3);
try {
	System.out.println(100/2);
	try {
		String s=null;
		System.out.println(s.charAt(4));
		}
	catch(NullPointerException e) {
		System.out.println("Null values");
	}finally {
		System.out.println("inner finally");
	}
		}catch(Throwable e) {
			System.out.println("dont divivde by zero");
		}finally {
			System.out.println("outer finally");
}
System.out.println(6);
System.out.println(7);
	}

}
