package com.atik;

import java.util.Arrays;

public class Floor {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=73;
        System.out.println(Arrays.toString(ceiling(arr,target)));
    }
    static int[] ceiling(int[] arr, int target){

        //but what if the target number is greater than the greatest number in the array
        //in that case
        if(target>arr[arr.length-1]){
            return new int[]{-1};
        }
        int start=0;
        int end=arr.length-1;

        //find the mid
        while(start<=end){

            //effective way of finding mid
            int mid= start+(end-start)/2;

            if(target==arr[mid]){
                return new int[]{mid}; //found the target index of mid also the best case
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return new int[]{end,arr[end]};
    }
}


