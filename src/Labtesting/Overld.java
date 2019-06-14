package Labtesting;

public class Overld {
public void OverId(int a) {
	System.out.println("enter the number"+a);

}
public void OverId(String name,int a) {
	System.out.println("two method"+name+a);

}
public void OverId(long ph,char a,String email) {
System.out.println("three method"+ph+email+a);
}
public void Overld(float salary) {
	System.out.println("emoloyee salary"+salary);
}
public static void main(String[] args) {
	Overld j=new Overld();
	j.OverId(1);
	j.OverId("Green", 1);
	j.OverId(98432l, 'g', "abc@gmail.com");
	j.Overld(75000f);
}

}
