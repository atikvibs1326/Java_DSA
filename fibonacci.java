package atik;

import java.util.Scanner;

public class fibonacci {
    //fibonacii nuber means series of number and the addition of previous 2 no is the next number and so on
    //Q find he nth fibonnaci no
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int  count =2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;

        }
        System.out.println(b);
    }

}
