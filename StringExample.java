package atik;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
      //  String message =greet();
        //System.out.println(message);

        Scanner in= new Scanner(System.in);
        System.out.print("Enter YOur name:");
        String Yname=in.next().trim();
        String personal=mygreet(Yname);
        System.out.println(personal);

    }

     static String mygreet(String name ) {
        String message="hello "+name;
        return message;
    }

  //  static String greet(){
      //  return "How are you";
    //}
    //string are immutable we cannot change the value of it because its of final class
}

