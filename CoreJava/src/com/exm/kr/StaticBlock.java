package com.exm.kr;

public class StaticBlock {
	static int a=200;
	static {
		a=100;
		System.out.println("in static block");
	}
	public static void main(String[] args) {
		System.out.println("in main method");
		System.out.println(a);

	}
}
