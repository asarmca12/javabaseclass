package org.exceptionhanding;

public class Controltry {
public static void main(String[] args) {
	String empId="123456";
	if(!empId.startsWith("19")) {
		try {
			throw new EmployeeNotFoundException();
		}
		catch(EmployeeNotFoundException e){
			System.out.println("employee not found in unit 1 list");
		
		}
	}
}
}
