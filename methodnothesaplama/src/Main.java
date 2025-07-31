import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("kac not girerceksiniz : ");
        int adet = input.nextInt();
        int[] notlar = new int[adet];

        for (int i = 0; i < adet; i++) {
            System.out.println((i + 1) + " . notu girin:");
            notlar[i] = input.nextInt();

        }
        System.out.println("endusuk :" + endusuk(notlar));
        System.out.println("ortalama  : " + ortalama(notlar));
        System.out.println("enyüksek    : " + enyuksek(notlar));
    }

    public static double ortalama(int[] dizi) {
        int toplam = 0;
        for (int not : dizi) {
            toplam += not;
        }
        return (double) toplam / dizi.length;
    }

    public static int enyuksek(int[] dizi) {
        int max = dizi[0];
        for (int not : dizi) {
            if (not > max)
                max = not;
        }

        return max;
    }
public static int endusuk(int[]dizi){
        int min=dizi[0];
        for (int not:dizi){
            if (not<min)
                min=not;
        }
                return min;
}


}


