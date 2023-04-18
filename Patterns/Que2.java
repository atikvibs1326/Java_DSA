package com.atik;
// Q
//    *****
//    ****
//    ***
//    **
//    *
public class Que2 {
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern3(int n){
        //Step1- outer loop will run the no of lines present in the Q

        for (int row = 1; row <=n ; row++) {
            //Step2- identify for every rowno,run the col
            for (int col=0;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
