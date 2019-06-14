package org.overridepoly;

public class Arts extends Education {
	@Override
	public void pg() {
		System.out.println("PG COURSE Details");
	}

	public void mba(String name) {
		System.out.println("Pg course Details is" + "\n" + name);
	}

	public void bsc() {
		System.out.println("Bsc");
	}

	public static void main(String[] args) {
		Arts a = new Arts();
		a.ug("UG COURSE");
		a.bsc();
		a.pg();
		a.mba("MBA,HR");
	}

}
