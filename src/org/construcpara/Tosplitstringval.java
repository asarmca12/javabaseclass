package org.construcpara;
 class TestStaticMethod{  
	int rollno;  
    String name;  
    static String college = "ITS";  
    //static method to change the value of static variable  
    static void change(){  
    college = "BBDIT";  
    }  
    //constructor to initialize the variable  
    TestStaticMethod(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display values  
    void display(){System.out.println(rollno+" "+name+" "+college);}  
    }  

public class Tosplitstringval {
	public static void main(String args[]){  
		TestStaticMethod.change();//calling change method  
	    //creating objects  
		TestStaticMethod s1 = new TestStaticMethod(111,"Karan");  
		TestStaticMethod s2 = new TestStaticMethod(222,"Aryan");  
		TestStaticMethod s3 = new TestStaticMethod(333,"Sonoo");  
	    //calling display method  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	
	
	
	
	 
}  
//Test class to create and display the values of object  
 }
