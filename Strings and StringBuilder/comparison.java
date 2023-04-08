import java.util.ArrayList;

public class Comparison {
    public static void main(String[] args) {
        String a ="Atik";
        String b="Atik";
//        System.out.println(a==b);


        String name1= new String("Leher");
        String name2 = new String ("Leher");

        //this name1==name2 wil give false as result because even if the the values are same the
//        //reference variable are different
//        System.out.println(name1==name2);

        //use of .equals method to cehck only the values  this will give true
//        System.out.println(name1.equals(name2));

       //String concatentaion operators

            System.out.println('a'+'b'); //this will get the ascii values of a and b and add them together as op
            System.out.println("a"+"b"); //this will concatenate two string values and then print the op
            System.out.println("a"+1);
            //this will output same as after few step "a"+"1"
            //this will convert the int to INTEGER wrapper class that will call the tostring() method

        System.out.println('a'+3);//this will get unicode of a which is 97 and add 3 which wil give op as 100

        System.out.println((char)('a'+3));//The expression (char)100 casts the integer value 100 to a char type,
        // resulting in the character 'd' (which has a Unicode value of 100).

        //adding  complex datatype

        System.out.println("atik"+ new ArrayList<>());

        System.out.println("atik"+ new Integer(13));

        // this below line while give error WHY?
        //The operator + in java ,its only define for primitive and when any of the values is a String
        System.out.println(new Integer(13)+""+new ArrayList<>());



    }
}
