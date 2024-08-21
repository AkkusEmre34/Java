import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int sayi = scanner.nextInt();
        int orijinalSayi = sayi;
        int toplam = 0;
        int basamakSayisi = 0;

        int tempSayi = sayi;

        while (tempSayi > 0) {
            tempSayi /= 10;
            basamakSayisi++;
        }

        tempSayi = orijinalSayi;

        while (tempSayi > 0) {
            int kalan = tempSayi % 10;
            int carpim = 1;


            for (int i = 0; i < basamakSayisi; i++) {
                carpim *= kalan;
            }

            toplam += carpim;
            tempSayi /= 10;
        }

        if (toplam == orijinalSayi) {
            System.out.println(orijinalSayi + " bir Armstrong sayisidir.");
        } else {
            System.out.println(orijinalSayi + " bir Armstrong sayisi değildir.");
        }
    }
}