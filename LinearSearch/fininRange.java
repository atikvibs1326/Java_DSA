package com.atik;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr={12,14,-7,18,20,56,90,23,-9};
        int target =14;
        int ans=search2(arr,target,1,5);
        System.out.println(ans);

    }
    static int search2(int [] arr,int target,int start ,int end){
            if(arr.length==0){
                return -1;
            }
             for (int i=start;i<end;i++){
            if(target==arr[i]){
                return i;
            }
        }
            return -1;
    }
}
