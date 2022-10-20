package atik;

public class Shadowing {
   static int x=20;
    public static void main(String[] args) {
        System.out.println(x);//20
        int x;//the class variable at line 4 is shadowed by this
      //  System.out.println(x);//scope will begin when value is initialized

        x=30;
        System.out.println(x);//30
        fun();
        //shadowing does not works in methods
    }
    static void fun(){
        System.out.println(x);
    }
}
