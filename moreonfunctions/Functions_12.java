package com.functions;

import java.util.Scanner;

public class Functions_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter range from :");
		int num1=in.nextInt();
		System.out.println("Enter range till :");
		int num2=in.nextInt();
		System.out.printf("\nPrime numbers between %d and %d are:\n",num1,num2);
		for(int i=num1;i<=num2;i++) {
			if(Primeinrange(i)) {
				System.out.println(i+" ");
			}
		}
		in.close();
	}
	static boolean Primeinrange(int no) {
		if(no==0 ||no==1)
			return false;
		if(no==2)
			return true;

		for(int i=2;i*i<=no;i++) {
			if(no%i==0) {
				return false;
			}
		}
		return true;
	}

}

