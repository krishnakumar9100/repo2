package com.exm.kr;

public class NonstaticBlocks {
	int a=300,b;
	{
		a=10;
		b=100;
		System.out.println("in non-static block");
	}
	public static void main(String[] args) {
		NonstaticBlocks n=new NonstaticBlocks();
		System.out.println("in main method");
		System.out.println(n.a);
		System.out.println(n.b);
	}

}
