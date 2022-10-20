package atik;

import java.util.Scanner;

public class Rectangle {
     static double Area(double l,double w){
        return l*w;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter Length:");
        double l=in.nextDouble();
        System.out.print("Enter width:");
        double w=in.nextDouble();
        System.out.println("Area of Rectangle is:"+Area(l,w));
    }

}
