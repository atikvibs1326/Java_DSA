package com.functions;

import java.util.Scanner;

public class Functions7 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter No:");
		int n=in.nextInt();
		System.out.println(isPrime(n));
		in.close();
		
		
		
	} 
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}c++;
		}
		if(c*c>n) {
			return true;
		}
		return false;
	}
}
