package com.functions;

import java.util.Scanner;
public class Functions1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the nos to find Largest and Smallest Among given three no");
		System.out.println("Enter no 1:");
		int no1=in.nextInt();
		System.out.println("Enter no 2:");
		int second=in.nextInt();
		System.out.println("Enter no 3:");
		int third=in.nextInt();
		int big=largest(no1,second,third);
		int least=smallest(no1,second,third);
		System.out.println("Largest is:"+big);
		System.out.println("Smallest is:"+least);
		in.close();
		
		
	}
	public static int largest(int first,int second,int third) {
		int max=first;
		if(second>max) {
			max=second;
		}
		if(third>max) {
			max=third;
		}
		return max;
	}
	public static int smallest(int first,int second,int third) {
		int min=first;
		if(second<min) {
			min=second;
		}if(third<min) {
			min=third;
		}
		return min;
	}
}
