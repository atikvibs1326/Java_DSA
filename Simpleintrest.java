package atik;

import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    int P = in.nextInt();
    int R = in.nextInt();
    int T = in.nextInt();

    int SI = (P*R*T)/100;

        System.out.println(SI);
}
}
