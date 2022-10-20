package atik;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun("atik","kunal","bravo","mylove");
        fun2(23,45,"Kunal","Atik");
    }
    static void fun2(int a,int b,String...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String...v){
        System.out.println(Arrays.toString(v));

    }
}
