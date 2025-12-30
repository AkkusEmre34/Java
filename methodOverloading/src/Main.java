import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        toplama(8, 56);
        toplama(3, 23.2);
        toplama(32.3, 3);
        toplama(4, 4, 52);
        toplama(2, 32, 3.4);


    }

    public static void toplama(int a, int b) {

        System.out.println(a + b);
    }

    public static void toplama(double emre, double x) {

        System.out.println(emre + x);

    }

    public static void toplama(double y, int a) {
        System.out.println(y + a);
    }


    public static void toplama(int a, int s, int v) {
        System.out.println(a + s + v);
    }

    public static void toplama(int s, int r, double p) {
        System.out.println(s + r + p);
    }
}


