package atik;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
//Q enter a character and check wheter the enterd character is lowercase or uppercase
        if(ch>='a' && ch<='z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }
    }







}
