package com.functions;

import java.util.Scanner;

public class Functions3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Age:");
		int number=in.nextInt();
		isEligible(number);
		in.close();
		
	}
	public static int  isEligible(int age) {
		if(age<18 || age>60) {
			System.out.println("You're not elegible vote");
		}else {
			System.out.println("Youre elegible to vote");
		}
		return age;
		
	}

}
