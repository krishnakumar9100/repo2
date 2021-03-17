package com.prgms;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		int temp=0,start=0,end=4;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;end--;
		}			
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]);
		}
	}

}
