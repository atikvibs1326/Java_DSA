package com.functions;

import java.util.Scanner;

public class Functions8_2 {
	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter Marks out of 100:");
		int mark=in.nextInt();
		getGrades(mark);
		System.out.print("");
		
		in.close();
	}
	public static String getGrades(int marks) {
		marks=0;
		switch((int)marks) {
		case 1:
			if(marks>=91 ||marks<=100) {
				return "Grade is AA";
			}
			break;
		case 2:
			if(marks>=81 ||marks<=90) {
				return "Grade is AB";
			}
			break;
		case 3:
			if(marks>=71 || marks<=80) {
			return "Grade is BB";
		}
			break;
		case 4:
			if(marks>=61 ||marks<=70) {
				return"Grade is BC";
			}
			break;
		case 5:
			if(marks>=51||marks<=60) {
				return "Grade is CD";
			}
			break;
		case 6:
			if(marks>=41 ||marks<=50) {
				return "Grade is DD";
			}
			break;
		 default:
			if(marks<=40) {
				return "Fail!";
			}
			break;
		}
		return "invalid";
		
	}
}
