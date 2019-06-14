package org.exceptionhanding;

public class Exception {
	public static void main(String[] args) {
		System.out.println("Green Technology");
		System.out.println("g");
		System.out.println("r");
		try {
			System.out.println(35 / 0);
		} catch (ArithmeticException e) {
			System.out.println("dont/0");
		} finally {
			System.out.println("i am final");
		}
		System.out.println("e");
		System.out.println("n");
	}

}
