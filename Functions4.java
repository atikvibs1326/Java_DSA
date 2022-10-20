package com.functions;

import java.util.Scanner;

public class Functions4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number1:");
		int num1=in.nextInt();
		System.out.println("Enter number2:");
		int num2=in.nextInt();
		int ans=add(num1,num2);
		int ans1=sub(num1,num2);
		System.out.println("The addition is:"+ans);
		System.out.println("the substraction is:"+ans1);
		
		in.close();
	}
	public static int add(int no1,int no2) {
		int res=no1+no2;
		return res;
	}
	public static int sub(int no1,int no2) {
		int res=no1-no2;
		return res;
	}
}