package atik;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter a Name:");
        Scanner in = new Scanner(System.in);
        name=in.nextLine();
        System.out.println(name+" Hey good evening");

    }
}
