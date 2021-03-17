package com.exm.kr;
class Iphone{
	static int size;
	int noofsoftwares;
	public void details(){
	System.out.println("size= "+size);
	System.out.println("noof softwares= "+ noofsoftwares);
	}
}
class land{
	int cost1;
	String location;
	public void placedetails() {
		System.out.println("cost of land= "+cost1);
		System.out.println("Address of land= "+location);
	}
}

public class MethodEx1 {

	public static void main(String[] args) {
		Iphone.size=6;
		Iphone v1=new Iphone();
		v1.noofsoftwares=10;
		Iphone v2=new Iphone();
		v2.noofsoftwares=20;
		v1.details();
		v2.details();
		land l1=new land();
		l1.cost1=10000;
		l1.location="Sattenapalli near tample";
		l1.placedetails();
		land l2=new land();
		l2.cost1=20000;
		l2.location="Sattenapalli near Vaddavalli";
		l2.placedetails();	}

}
