package com.exm.kr;

class exm{
	public static int run() {
		return 23;
	}
}
class MethodsEx3 {
	public String run1(String i,String j) {
		String k=i+j;
		return k;
	}
	public static void main(String[] args) {
		System.out.println(exm.run());
		MethodsEx3 b=new MethodsEx3();
		System.out.println(b.run1("krishna ","kumar"));
	}

}
