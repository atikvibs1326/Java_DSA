package atik;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a Integer:");
        Scanner in = new Scanner(System.in);
        num=in.nextInt();
        if(num%2==0){
            System.out.println("Even number is:"+num);
        }else{
            System.out.println("Odd number is:"+num);
        }
    }
}
