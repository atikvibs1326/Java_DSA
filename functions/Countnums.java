package atik;

public class Countnums {
    public static void main(String[] args) {
        int no = 456444;
//Q take a number and result the repittive digit in the given number
        int count = 0;
        while (no > 0) {
            int rem = no % 10;
            if (rem == 4) {
                count++;
            }
            no = no / 10;
        }
        System.out.println(count);
    }

}
