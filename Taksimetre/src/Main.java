import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("aracın km basına yaktıgı tutarı girin : ");
        double tutar= scanner.nextDouble();
        System.out.println("aracın aldıgı yolu km olarak girin : ");
        double yol= scanner.nextDouble();

        double maliyet=tutar*yol;
        System.out.println("taksimetre : " + maliyet);
    }
}