package atik;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    while(true){
        System.out.println("Enter day:");
        int day=in.nextInt();
            if(day==0){
                break;
            }
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Enter valid Day!");

        }

    }}
}

