import java.util.Scanner;

public class rev {

	public static void main(String[] args) {
	System.out.println("enter the string");
	Scanner st=new Scanner(System.in);
	String s= st.nextLine();
	
	StringBuilder sm=new StringBuilder(s);
System.out.println("reverse string");
	System.out.println(sm.reverse().toString());
	}
}
