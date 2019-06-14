package Labtesting;

public class Single extends Sing{
	
@Override
public void fixed(int a) {
System.out.println("5%"+a);
}
public void deposit() {
	System.out.println("6%");
	
}
public static void main(String[] args) {
	Single g=new Single();
	g.saving();
	g.deposit();
	g.fixed(4);
}
}
