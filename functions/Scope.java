package atik;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        {
       //     int a=78;//already initialized outside the block in the same method,hence you cannot intialize them again
            a=99;//reassigning the orignal refrence variable to some other value
            int c=86;
            System.out.println(c);
            System.out.println(a);
            //values intialised in this block ,will rmain in this block
        }
        System.out.println(a);
    }
    static void random(int marks){
     int num=67;
        System.out.println(num);
        System.out.println(marks);
//scoping in the for loops
        for(int i=0;i<4;i++){

        }
        //System.out.println(i);
    }
}
//rule for scope
//rule no 1: anythining is defined inside a block can be only accessed in that block
//rule no something is already intialized outside we can modify,update and access
