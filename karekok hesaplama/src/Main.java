import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci kenarini giriniz: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("Ikinci Kenari giriniz : ");
        double kenar2 = scanner.nextDouble();

        double sonuc = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        System.out.println("Ucuncu kenar = " + sonuc);

    }
}