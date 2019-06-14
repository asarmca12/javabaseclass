package Labtesting;

public class Inter implements Rbii {

	@Override
	public void saving() {
	System.out.println("5%");
	}

	@Override
	public void fixed() {
		System.out.println("6%");
		
	}

	@Override
	public void deposit() {
		System.out.println("7%");
		
	}
	public static void main(String[] args) {
		Inter g=new Inter();
		g.saving();
		g.deposit();
		g.fixed();
	}

}
