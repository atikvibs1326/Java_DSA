package atik;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //Q: Calculating Area of Triangle
        Scanner in= new Scanner(System.in);
        System.out.print("Enter Height:");
        double h=in.nextDouble();
        System.out.print("Enter Base:");
        double b=in.nextDouble();
        double a=(h*b)/2;
        System.out.println("Area of Triangle is:"+a);

    }
}
