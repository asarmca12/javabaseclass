package org.constructor;

public class Sample {
public Sample() 
{
	Super();
	//this(100);

	System.out.println("default");
}

private void Super() {
	// TODO Auto-generated method stub
	
}

public  void Sample1(String name) {
	System.out.println("enter the name  "  + name);
}
public Sample(int id) {
	//this("asar");
	System.out.println("inter number  "   + id);
}

public static void main(String[] args) {
	Sample m=new Sample();
	m.Sample1("techno");	
}

private void Sample(String string) {
	// TODO Auto-generated method stub
	
}

private void toString(String string) {
	// TODO Auto-generated method stub
	
}
}
