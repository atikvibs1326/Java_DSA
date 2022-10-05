package atik;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        //Q:find the area of circle program
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius:");
        int r=in.nextInt();
        double pi=3.14;
        double a=0.0;
        a=pi*r*r;
        System.out.println("Area of Circle:"+a);

    }
}
