package atik;

import java.util.Scanner;

public class Cylnder {
    //Q: Calculate Curved Surface Area of Cylinder
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius:");
        double r=in.nextDouble();
        System.out.print("Enter Height:");
        double h=in.nextDouble();
        double a=2*3.14*r*h;
        System.out.println("Curved Surface Area :"+a+"cm^2");
    }
}
