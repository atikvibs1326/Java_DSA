package com.atik;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target =7;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    static  int[] searchRange(int[] nums, int target){
            int[] ans={-1,-1};
            //check for the fist occurence
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;

        return ans;
    }
    static int search(int []arr,int target,boolean firstIndex){
       int ans=-1;

        int start=0;
        int end = arr.length-1;

        while(start<=end){
            //find the mid
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //potential ans
                    ans=mid;
                    if(firstIndex){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
            }
    }
       return ans;
}
}
