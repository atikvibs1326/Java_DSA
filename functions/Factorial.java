import java.util.Scanner;
class Factorial{
  public static void main(String[] args){
  System.out.println("Enter the no to find the factorial:");
  Scanner in = new Scanner(System.in);
  int no=in.nextInt();
  System.out.println("The factorial of "+no+"is"+factorial(no));
  }
  //using forloop
  static int factorial(int n){
      int fact=1;
      for(int i=1;i<=n;i++){
          fact=fact*i;  //OR   fact*=i;
      }
    return fact;
  }
  //using whileloop
  static int factorial2(int n){
    int fact=1;
    int i=1;
    while(i<=n){
      fact=fact*i;
      i++;
    }
    return fact;
  }
  //using recursion
  static int isfact(int a) {
        if (a == 0) {
            return 1;
        }
        return a * isfact(a - 1);

    }
  
}
