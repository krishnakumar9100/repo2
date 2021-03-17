package com.exm.kr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionEX {  
    public static void main(String[] args) {  
    	UnCheckedException u=new UnCheckedException();
    	//u.Arithmaticexception();
    	//u.IndexOutOFBoundException();
    	//u.InputMismatchException();
    	//u.NullPointerException("kumar");
    	CheckedException ce=new CheckedException();
    	//ce.filenotfoundeception();
    }  
}
class UnCheckedException{
	public static void Arithmaticexception() {
		 try{  
  		   int data=25/0;  
  		   System.out.println(data);  
  		  }  
  		  catch(Exception e){
  			  System.out.println(e);
  			  }  
  		  finally{
  			  System.out.println("finally block is always executed");
  			  }  
  		  System.out.println("rest of the code...");  
	}
	public static void IndexOutOFBoundException() {
		int[] a= {17,18,113,441};
		try {
			System.out.println(a[5]);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			  System.out.println("finally block is always executed");
		}  
		  System.out.println("rest of the code...");  
	}
	public static void InputMismatchException() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first value");
			int a=sc.nextInt();
			System.out.println("enter second value");
			int b=sc.nextInt();
			int c=a/b;
		}
		catch(Exception e) {
			 System.out.println(e);
		}
		finally{
			  System.out.println("finally block is always executed");
		}  
		  System.out.println("rest of the code...");  
	}
	
	static String x;
	public static void NullPointerException(String i) {
		String s="Kumar@R";
		try {
		System.out.println("First character: " + x.charAt(0));
		}
		catch(Exception e) {
			 System.out.println(e);
		}
		finally{
			  System.out.println("finally block is always executed");
		}  
		  System.out.println("rest of the code...");  
	}
}

class CheckedException{
	public static void filenotfoundeception() {
		File file = new File("not_existing_file.txt");
	    try {
			FileInputStream stream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("filenotfound exception");
		}
	    finally{
			  System.out.println("finally block is always executed");
		}  
		  System.out.println("rest of the code...");  
	}
}