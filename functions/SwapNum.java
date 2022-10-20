package atik;

import java.util.Scanner;

public class SwapNum {

    public static void main(String[] args) {
      /*  int a=20;
        int b=30;
                int temp=a;
                a=b;
                b=temp;
        System.out.println(a+" "+b);
*/
        //for primitive:int,short,char,byte =just passing value
        //for objects and reference =passing value of of the reference variable
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();//this is where we have defined the variable from the function
        int num2=in.nextInt();
        swap(num,num2);
       // System.out.println(num+""+num2);
    }

    static void  swap(int num, int num2){//this variable has scope within this function only
        int temp=num;                    //in order to use them we need to define it in the main function
        num=num2;
        num2=temp;
        System.out.println(num+" "+num2);

    }
}
