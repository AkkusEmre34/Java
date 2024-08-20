import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayınızı girin : ");
        int sayi = scanner.nextInt();
        int total = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i  == 0)
                total = total + i;
        }
        if (sayi == total) {
            System.out.println("sayınız mukemmeldir ");
        }
else {
            System.out.println(" sayınız mükemmel degildir ");
        }
    }
}