import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayınızı girin :  ");
        int sayı = input.nextInt();
        int total = 0;
        for (int i = 1; i < sayı; i++) {
            if (sayı % i == 0) {
                total = total + i;
            }
        }
        if (sayı == total) {
            System.out.println("sayı mükemmel sayıdır");

        } else System.out.println("sayı mükemmel değildir");

    }

}


