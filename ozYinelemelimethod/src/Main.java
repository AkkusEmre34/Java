import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(faktoriyel(8));

    }


    public static int faktoriyel(int n) {
        if (n == 0) {
            return 1;

        } else {
            return n * faktoriyel( n - 1);
        }
    }
}