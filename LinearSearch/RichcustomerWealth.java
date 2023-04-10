package com.atik;

public class RichCustomer {
    public static void main(String[] args) {
        int[][] arr={
                {2,4,6},
                {6,2,4}
        };
        int ans=MaxWealth(arr);
        System.out.println(ans);


    }
    static int MaxWealth(int [][]account){
        int max=Integer.MIN_VALUE;

        //person=i
        //account=j
        for (int i = 0; i < account.length ; i++) {
            int count=0;
            for (int j = 0; j <account[i].length ; j++) {
                count+=account[i][j];

            }
            //now we have sum of accounts of person =i
            //check with overall ans
            if(count >max){
                max=count;
            }
        }
        return max;
    }

}
