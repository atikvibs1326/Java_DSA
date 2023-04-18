package com.atik;
//Q1
//    *****
//    *****
//    *****
//    *****
//    *****
public class Que1 {
    public static void main(String[] args) {
            pattern2(5);
    }
    static void pattern2(int n){
        //Step1- outer loop will run the no of lines present in the Q
        for (int i = 1; i <=n ; i++) {

            //step-2 identify for every row no,run the col
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
