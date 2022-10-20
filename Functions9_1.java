package com.functions;

import java.util.Scanner;

public class Functions9_1 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter number:");
	int num=in.nextInt();
	System.out.println("Factorial of num is:"+isfact(num));
	in.close();
	}
	public static int isfact(int a) {
		if(a==0) {
			return 1;
		}
			return a*isfact(a-1);
		
	}

}
