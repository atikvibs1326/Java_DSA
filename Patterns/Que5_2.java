package com.atik;

public class Que5_2 {
    public static void main(String[] args) {
        pattern5_2(5);
    }

    static void pattern5_2(int n) {
        for (int i = 1; i <= n; i++) {

            //Step2- identify for every rowno,run the col

            for (int j = 1; j <= i; j++) {

                // What do you want to print
                System.out.print("*  ");
            }
            //print newline
            System.out.println();
        }
            for (int row = 1; row <= n; row++) {
                //Step2- identify for every rowno,run the col
                for (int col = 0; col <= n - row-1; col++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
    }

