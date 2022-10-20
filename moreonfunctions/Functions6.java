package com.functions;

import java.util.Scanner;


public class Functions6 {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Radius:");
		int radius =in.nextInt();
		double ans=AreaofCircle(radius);
		System.out.println(ans);
		double ans1=Circumfurance(radius);
		System.out.println(ans1);
		in.close();
	}

	public static double AreaofCircle(int rad) {
			double pi=3.14;
			double res=pi*(rad*rad);
			return res;
}
	public static double  Circumfurance(int rad) {
		double pi=3.14;
		double res1=2*pi*rad;
		return res1;
	}
}
