package com.exm.kr;

import java.util.*;

public class CollectionsConArrayToList{

	public static void main(String[] args) {
		//Converting Array to List 
		String[] a= {"kumar","krishna","leela"};
		ArrayList list=new ArrayList();
		for(String s:a) {
			list.add(s);
		}
		System.out.println(list);
		
		//Converting List to Array 
		TreeSet list1=new TreeSet();
		list1.add("java");
		list1.add("sql");
		list1.add("Ui");
		list1.add("sql");
		list1.add("");
		Object[] array = list1.toArray(new String[list1.size()]);
		System.out.println(list1);
	}
}