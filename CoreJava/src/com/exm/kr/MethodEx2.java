package com.exm.kr;

class test{
	public static void exm(int i) {
		System.out.println(i);
	}
}
class MethodEx2 {

	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		test.exm(113);
		MethodEx2 a=new MethodEx2();
		a.add(17, 18);
	}

}
