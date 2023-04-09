package com.atik;

import java.util.Arrays;

public class Searchin2d {
    public static void main(String[] args) {
        int [][]arr={
                {12,85,65,12,96},
                {45,-8,-9,74,123,654},
                {3,5,9,21,24,-6}
        };
        int target=-9;
        int []ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][]arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

