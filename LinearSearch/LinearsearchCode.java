package com.atik;

import java.util.Arrays;
import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr= new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int target=in.nextInt();
        int ans=linearSearch(arr,target);
        System.out.println(Arrays.toString(new int[]{ans}));
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run a forloop
        for (int i = 0; i <arr.length ; i++) {
            int element=arr[i];
            if(element==target){
                return element;
            }
        }
        return -1;
    }
}
