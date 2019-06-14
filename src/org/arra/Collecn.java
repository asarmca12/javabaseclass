package org.arra;

import java.util.ArrayList;
import java.util.List;

public class Collecn {
	public static void main(String[] args) {
		//List li = new ArrayList();
		List <Integer> li=new ArrayList<Integer>();
		li.add(300);
		li.add(200);
		li.add(250);
		li.add(30);
		li.add(2);
		System.out.println(li);
//		int s=li.size();
//		System.out.println(s);
//		
//		Integer i=li.get(3);
//		System.out.println(i);
//		
//		li.add(2,550);
//		System.out.println(li);
//		li.remove(2);
//		System.out.println(li);
//	int i2=li.indexOf(5);
//		System.out.println(i2);
//		int j=li.lastIndexOf(3);
//		System.out.println(j);
	for(Integer i=0; i<li.size();i++)
		System.out.println(li);
//		for(Integer x: li) {
//			System.out.println(x);
//		}
		
	}

}

