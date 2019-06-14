package org.Multilevelsiginher;

public class Client extends Employee{
public void clientid() {
	System.out.println("Client id is:20");
}
public void clientname() {
System.out.println("Client Name is:hasan");
}
public static void main(String[] args) {
	Client C=new Client();
	C.cmpid();
	 C.comanyname();
	 C.address();
	 C.empid();
	 C.empname();
	 C.clientid();
	 C.clientname();
}
}
