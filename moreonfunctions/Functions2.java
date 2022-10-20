package com.functions;

import java.util.Scanner;

public class Functions2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the number:");
		int num=in.nextInt();
		evenorodds(num);
		in.close();

	}
	public static int evenorodds(int number) {
		if(number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		return number;
	}

}
