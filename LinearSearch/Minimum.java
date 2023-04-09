package com.atik;

public class MiniNum {
    public static void main(String[] args) {
        int[] arr= {18,1300,-12,-7,3,14,28,560};
        int ans=min(arr);
        int ans2=max(arr);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int min(int [] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
                if(arr[i]<ans){
                    ans=arr[i];
                }
        }
        return ans;
    }
    static int max(int [] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }

}
