package com.prgms;

public class SortingArray {

	public static void main(String[] args) {
		{  sorting();
			//creating an instance of an array  
			int[] arr ={78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
			System.out.println("Array elements after sorting:");  
			//sorting logic  
			for (int i = 0; i < arr.length; i++)   
			{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
			int tmp = 0;  
			if (arr[i] > arr[j])   
			{  
			tmp = arr[i];  
			arr[i] = arr[j];  
			arr[j] = tmp;  
			}  
			}  
			//prints the sorted element of the array  
			System.out.println(arr[i]);  
			}  
			}  
	}
	public static void sorting() {
		int[] a= {1,13,441,17,18,2,1};
		for (int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				int temp=0;
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a);
		}
	
	}
}

