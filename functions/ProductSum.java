package atik;

import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        //Q:Subtract the Product and Sum of Digits of an Integer
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int num =in.nextInt();
        int sum=0;
        int product=1;

        while(num>0){
             sum+=num%10;
             product *= num%10;
                num/=10;
        }
        System.out.println(product-sum);

    }
}
