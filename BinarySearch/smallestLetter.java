package com.atik;


public class smallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'd', 'f', 'j'};
        char target = 'j';
        System.out.println((nextGreatestLetter(arr, target)));
    }

    static char nextGreatestLetter(char[] letters, char target) {

        //but what if the target number is the greater than the greatest number in the array
        // in that case
        int start = 0;
        int end = letters.length - 1;

        //find the mid
        while (start <= end) {

            //effective way of finding mid
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}



