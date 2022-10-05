package atik;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Temprature in C:");
        float tempc=in.nextFloat();
        float farc = (tempc * 9/5)+32;
        System.out.println(farc);
    }
}
