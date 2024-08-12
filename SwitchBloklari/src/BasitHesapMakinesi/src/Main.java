import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz :");
        int sayi2 = scanner.nextInt();
        int sonuc;
        int secim;
        System.out.print(" secim : ");

        secim = scanner.nextInt();
        switch (secim) {
            case 1:
                System.out.print("toplama");
                sonuc = sayi1 + sayi2;
                System.out.print(" sayıların toplamı = " + sonuc);
                break;

            case 2:
                System.out.print("cıkarma");
                if (sayi1 >= sayi2) {
                    sonuc = sayi1 - sayi2;
                    System.out.print(" sayıların farkı = " + sonuc);
                }
                if (sayi2 > sayi1) {
                    sonuc = sayi2 - sayi1;
                    System.out.print(" sayıların farkı = " + sonuc);
                }

                break;

            case 3:
                System.out.print("carpma");
                sonuc = sayi1 * sayi2;
                System.out.print(" sayıların carpımı = " + sonuc);
                break;
            case 4:
                System.out.print("bölme");
                sonuc = sayi1 / sayi2;
                System.out.print(" sayıların bölümü " + sonuc);
                break;
            default:
                System.out.print("gecersiz");
                break;
        }


    }
}