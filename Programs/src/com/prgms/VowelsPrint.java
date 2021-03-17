package com.prgms;

import java.util.Scanner;

public class VowelsPrint{
	public static void main(String[] args) {
		String s="krishna kumar";
		String s5="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				s5=s5+c;
			}
		}
		System.out.println(s5);
	}
}
