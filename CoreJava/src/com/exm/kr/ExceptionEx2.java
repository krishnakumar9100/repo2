package com.exm.kr;

public class ExceptionEx2 {

	public static void main(String[] args) {
		//throwkeyword();
		throwskeyword();
		System.out.println("rest of the coode....");
	}
	public static void throwkeyword() {
		int age=10,j=18;
		try {
		if(age<j) {
			throw new ArithmeticException("eligible for the vote");
		}
		else {
			System.out.println("not eligible");
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("rest of the coode....");
	}
	public static void throwskeyword() throws ArithmeticException {
		int i=10,j=0;
		int c=i/j;
		System.out.println("rest of the coode....");
	}
}
