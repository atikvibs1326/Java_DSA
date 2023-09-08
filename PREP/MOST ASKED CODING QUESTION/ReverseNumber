package com.practice;
//Most Asked interview question

//Q1:Reverse a Number
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number you want reverse:");
        Scanner in = new Scanner(System.in);
        int myNum=in.nextInt();
        System.out.println(reverse(myNum));
    }
    static int reverse(int num) {
            int rev=0;
            while (num > 0) {
                int rem = num % 10;
                num=num/10;
                rev=rev*10+rem;
        }
        return rev;
        }
    }
