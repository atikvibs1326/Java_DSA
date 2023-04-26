package com.atik;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums={3,5,7,9,10,90,
                    100,130,140,160,170};
        int target=10;
        System.out.println(ans(nums,target));


    }
    static int ans(int[] arr,int target){
        //first find the range
        //first start with the box of 2
        int start=0;
        int end=1;
        //condition for the target to lie in the range
        while(target>arr[end]){
            int temp=end+1;  //this is my new Start
            //double the box value
            //end=previous end+sizeof chunk*2
            end=end+(end-start+1)*2;//remember here we are using the old start new start will change the answer
            start=temp;
        }
        return  Search( arr,target,start,end);
    }
    static int Search(int[] arr,int target,int start,int end){
        //condition for while loop
        while(start<=end){
            //find the middle element
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                return mid;//found the target index of mid also the best case
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
