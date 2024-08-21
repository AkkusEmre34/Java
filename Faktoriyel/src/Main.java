import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen sayınızı girin : ");
        int sayi = scanner.nextInt();
        int sonuc = 1;
        for (int i = 2; i <= sayi; i++) {

            sonuc *= i;
        }
        System.out.print("giridiginiz sayının faktöriyeli : " + sonuc);

    }
}