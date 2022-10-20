package atik;

//import java.util.Scanner;

public class MethodsExample {
    public static void main(String[] args) {
//Q take 2 number as input and return the sum
        int ans =sum2(23,45); //function calling and
        System.out.println(ans); //function value is stored in the var ans and we are printing that var ans

    }
    //pass the vlaue of numbers when you are calling the method in main()
        static int sum2(int a,int b){
            return a+b;

        }}
   /* static int sum(){
        Scanner in = new Scanner(System.in);//we dont want to use scanenr and inputs multiple
        System.out.print("Enter no 1:");
        int num1=in.nextInt();      //int num1 is a parameter/arguments.
        System.out.print("Enter no 2:");
        int num2=in.nextInt();      //int num2 is a parameter/arguments.
        return num1+num2;//return means end of the method
        //void is used when we dont want our method to return anything
    }
}
/*
    return_type name(arguments){

    //body
    return statment
    }
 */
