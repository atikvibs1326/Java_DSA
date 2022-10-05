package atik;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //Q:Input a number and print all the factors of that number (use loops).
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to find factors:");
        int num=in.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println("Factors are:"+i);
            }
        }
    }
}
