package atik;

public class Overloading {
    public static void main(String[] args) {
        demo(5);
        demo("atik");
    }
    static void demo(int a){
        System.out.println(a);
    }
    static void demo(String name){
        System.out.println(name);
    }
}
