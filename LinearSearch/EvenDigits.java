package com.atik;

import java.util.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={12,23,456,13456,-56,-4,3,0};
        System.out.println(find(nums));
    }
    static int find(int []nums){
        int count=0;
        for (int ele :nums) {
            if(even(ele)){
                count++;
            }
        }

    return count;
    }

    //function to check either a number contains
    //even no of digits or not

     static boolean even(int i) {
        int eno=digit(i);
        if(eno%2==0){
            return  true;
        }
        return false;
    }

    static int digit(int num){
        int c=0;
        while(num>0){
            num=num/10;  //
            c++;
        }
        return c;
    }

}
