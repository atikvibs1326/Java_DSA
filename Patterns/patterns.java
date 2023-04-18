package com.atik;
//Q
//      *
//      *  *
//      *  *  *
//      *  *  *  *

public class patterns {
    public static void main(String[] args) {
        pattern1(4);
    }

    static void pattern1(int n){
        //Step1- outer loop will run the no of lines present in the Q

        for (int i=1;i<=n;i++){

            //Step2- identify for every rowno,run the col

            for (int j=1;j<=i;j++){

                // What do you want to print
                System.out.print("*  ");
            }
            //print newline
            System.out.println();
        }
    }
}
