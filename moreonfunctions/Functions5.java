package com.functions;

import java.util.Scanner;

public class Functions5 {
	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter no 1:");
		int num1=in.nextInt();
		System.out.println("Enter no 2:");
		int num2=in.nextInt();
		int ans=product(num1,num2);
		System.out.println("The product of two nos is:"+ans);
		in.close();
		
		
	}
	public static int product(int x,int y) {
		int res=x*y;
		return res;
	}
}
