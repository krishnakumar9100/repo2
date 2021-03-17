package com.prgms;

public class ReverseOfString {
	public static void main(String[] args) {
		reversemethod();	
	}
	public static void emptystring() {
		String s="krishnakumar";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			s1=s1+c;
		}
		System.out.println(s1);
	}
	public static void reversemethod() {
		StringBuffer s=new StringBuffer("krishnakumar");
		s.reverse();
		System.out.println(s);
	}
	public static void reversewithoutempty() {
		String reverseMe = "reverse me!";
		for (int i = 0; i < reverseMe.length(); i++) {
		    reverseMe = reverseMe.substring(1, reverseMe.length() - i)
		        + reverseMe.substring(0, 1)
		        + reverseMe.substring(reverseMe.length() - i, reverseMe.length());
		 }
		 System.out.println(reverseMe);	
	}
}