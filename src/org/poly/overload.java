package org.poly;

public class overload {
	public void empid(String name) {
		System.out.println("String method" + name);
	}

	public void empid(long phno, String email, char block) {
		System.out.println("3 method" + phno + "\n" + email + "\n" + block);

	}

	public static void main(String[] args) {
		overload ol = new overload();
		ol.empid("greens");
		ol.empid(987642l, "abcde@gmail.com", 's');
	}

}
