package com.exm.kr;

class Sample extends Thread{
	public void run() {
		System.out.println("in run");
	}
}
class Sample1 implements Runnable{
	@Override
	public void run() {
		System.out.println("in run and runnable");
	}
}

public class MultiThreadung {
	public static void main(String[] args) {
		Sample s=new Sample();
		s.start();
		Sample1 s1=new Sample1();
		Thread t=new Thread(s1);
		t.start();
		}
}