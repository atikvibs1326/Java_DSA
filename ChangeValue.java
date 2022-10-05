package atik;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[]arr={1,25,45,85};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int []num){
        num[1]=67;//objects and stuff use the value of reference variable to pass the value
        //if you make the change via refrence variable ,same object will be changed
    }
}
//int arr[] is pointing to same array           {1,25,45,85}
//int num[] is also pointing to the sa0me array  {1,25,45,85}
