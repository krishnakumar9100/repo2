package com.prgms;

public class Palindrome {
	public static void main(String[] args) {
		String s="mom";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			s1=s1+c;
		}
		if(s.equals(s1)) {
			System.out.println("given string is plindrome");
		}
		else {
			System.out.println("given string is not a plindrome");
		}
	}

}
