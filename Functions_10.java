package com.functions;

import java.util.Scanner;

public class Functions_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=in.nextInt();
		if(ispalindrome(num)==true) {
			System.out.println("is a plaindrome");
		}else {
			System.out.println("is not a palindrome");
		}
	}
	static boolean ispalindrome(int no) {
		int rev=0;
		int temp=no;
		while(temp!=0) {
			int rem=temp%10;
			temp/=10;
			rev=rev*10+rem;
		}
		return (rev==no);
	}
}