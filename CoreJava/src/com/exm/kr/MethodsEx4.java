package com.exm.kr;

class MethodsEx4 {

	public static void k1() {
		System.out.println("in k1 static method");
		System.out.println(k3(17));;
	}
	public void k2() {
		System.out.println("in k2 Non-static method");
		k4();	
	}
	public static int k3(int i) {
		return 18;
	}
	public void k4() {
		System.out.println("in k4 Non-static method");
	}
	public static void main(String[] args) {
		MethodsEx4 o=new MethodsEx4();
		k1();
		o.k2();

	}

}
