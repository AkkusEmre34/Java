import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int sayı = scanner.nextInt();

        int orjinal = sayı;
        int ters = 0;
        while (sayı > 0) {
            int basamak = sayı % 10;
            ters = ters * 10 + basamak;
            sayı /=10;
        }
        if (orjinal == ters) {
            System.out.println("sayı palindrom");

        } else {
            System.out.println("sayı palindrom değil");
        }

    }
}