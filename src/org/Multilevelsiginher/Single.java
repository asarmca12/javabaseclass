package org.Multilevelsiginher;

public class Single {
static Single jj=null;
 Single() {
	
}
public synchronized static Single getInstance() {
	
if(jj==null)	
{
	jj=new Single();
	System.out.println(jj);
}
	return jj;
	
}
public void getid() 
{
System.out.println("12");	

}
public void getname() {
System.out.println("greens tech");

}

}
