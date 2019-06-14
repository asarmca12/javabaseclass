package org.construcpara;

public class ToremoveSpecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String input = "Hi selva H*ow a@r#e y$ou";
			String regx = "*#@$";
		    char[] ca = regx.toCharArray();
		    for (char c : ca) {
		        input = input.replace(""+c, "");
		    }
		    System.out.println(input);

		

		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}
}
		
		

