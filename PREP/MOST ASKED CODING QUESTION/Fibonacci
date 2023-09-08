package com.practice;

import java.util.Scanner;
//Most Asked interview question

//Q1:Find the nth Fibonacci number
public class Fibonacci {
    //fibonacii nuber means series of number and the addition of previous 2 no is the next number and so on
    //like 0,1,1,2,3,5,8,13,21....  0+1=1,1+1=2,2+1=3,3+2=5,5+3=8.......
    //Q find he nth fibonnaci no
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int previous = 0;
        int currindex = 1;
        int count=2;
       while(count<=n){
           int temp=currindex;
           currindex=currindex+previous;
           previous=temp;
           count++;
       }
        System.out.println(currindex);
    }

}
