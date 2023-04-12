package com.atik;

public class BinarySearch {
    public static void main(String[] args) {
       int [] nums={90,78,50,43,12,9,3};
        //int [] nums={12,13,40,56,79,120,2450};
        int target=12;
        System.out.println(bsearch(nums,target));
    }
    static int bsearch(int[] arr,int target){
       int start=0;
       int end=arr.length-1;

       while(start<=end){
        //find the middle element
           int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
                if(start>end){
                    if(target<arr[mid]){
                        end=mid-1;
                    }else {
                        start=mid+1;
                    }
                }else if(target>arr[mid]){
                        end=mid-1;
                    }else {
                        start=mid+1;
                    }
                }
        return -1;
       }

    }

