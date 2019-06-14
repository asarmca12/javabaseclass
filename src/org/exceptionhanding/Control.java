package org.exceptionhanding;

public class Control {
public static void main(String[] args) throws EmployeeNotFoundException {
	String empId="123456";
	if(!empId.startsWith("19"));
	{
		throw new EmployeeNotFoundException();
	}
	System.out.println(empId);
}
}
