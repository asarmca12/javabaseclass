package Abstrac;

public class Common extends Abstr {
	@Override
	public void saving() {
		System.out.println("6%");
	}

	@Override
	public void deposit() {
		System.out.println("8%");
	}


	public void fixed() {
		
	System.out.println("10%");
	}
	public static void main(String[] args) {
		Common oo = new Common();
		oo.saving();
		oo.fixed();
	}
}
