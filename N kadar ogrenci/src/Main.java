import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" kac ogrenci gireceksiniz : ");
        int adet = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i <= adet; i++) {

            System.out.println(i + " . ogrencinin notunu giriniz : ");
            int not = scanner.nextInt();
            toplam=toplam+not;
        }

        double ortalama=toplam/adet;
        System.out.print("ortalamaniz : " + ortalama  );
    }
}