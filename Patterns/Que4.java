package com.atik;

public class Que4 {
    public static void main(String[] args) {
        pattern4(5);
    }
    static void pattern4(int n){
        //Step1- outer loop will run the no of lines present in the Q
                for (int row=1;row<=n;row++){

                    //Step2- identify for every rowno,run the col

                 for (int col=1;col<=row;col++){
                     System.out.print(col+ "  ");
                 }
                    System.out.println( );
                }

    }
}
