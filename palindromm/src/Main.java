import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("sayı girin : ");
        int sayı = input.nextInt();
        int ters = 0;

        int orjinal = sayı;
        while (sayı > 0) {
            ters = ters * 10 + sayı % 10;
            sayı /= 10;

        }
        if ( ters==orjinal ) {
            System.out.println(orjinal + " sayınız palidrom");
        } else {
            System.out.println(orjinal + " sayı palidrom değil ");
        }

    }
}