package com.functions;

import java.util.Scanner;

public class Functions_13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the n:");
		int no=in.nextInt();
		System.out.println(sumofnatural(no));
		in.close();

	}
	
	static int sumofnatural(int n ) {
		 return n * (n + 1) / 2;
	}

}
