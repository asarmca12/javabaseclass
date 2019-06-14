package org.Multilevelsiginher;

public class Onemoresing {
	
	{

}

public static Onemoresing getInstance() {
	
	if(g==null)
	{
		g=new Onemoresing();
		System.out.println(g);
		
	}
	
	return g;
}
public void getname() {
	System.out.println("Green");

}
}