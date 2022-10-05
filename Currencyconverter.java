package atik;

import java.util.Scanner;

public class Currencyconverter {
    public static void main(String[] args) {
        float INR;
        //convert inr to usd
        System.out.println("enter ruppee to convert: ");
        Scanner in = new Scanner(System.in);
        INR =in.nextFloat();
        float dollars = (float) (INR/79.72);
        System.out.println( "after conversion usd is:"+dollars);
    }
}
