package atik;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        if(ispalindrome(num)==true){
            System.out.println("is a palindrome");
        }else{
            System.out.println("is not a palindrome");
        }
//
//        int ans=0;
//
//        while(num > 0){
//            int rem=num %10;
//            num/=10;
//            ans = ans*10+rem;
//        }
//
//        System.out.println(ans);

    }
    static boolean ispalindrome(int no){
       int rev=0;
       int temp=no;
       while(temp!=0){
       rev=(rev*10)+(temp%10);
       temp /=10;
       }
       return (rev==no);
    }


}
