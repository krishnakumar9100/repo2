package com.exm.kr;

import java.util.*;
import java.util.stream.Stream;

public class CollectionsPrinting {	
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("kumar");
		a.add("atmakuri");
		a.add(12);
		a.add('k');
		//1. by using for loop printing the values
		/*for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}*/
		
		//2. by using forEach loop printing the values
		/*for(String list:a) {
			System.out.println(list);
		}*/
		
		//3. by using Iterator loop printing the values
		/*Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		
		//4.by using toString() printing the values
		//System.out.println(a.toString());
		
		//5.printing directly
		System.out.println(a);
		}
}