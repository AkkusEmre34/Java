import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" araba markasını girin : ");
        String marka= scanner.nextLine();

        System.out.print(" aracın yılını giriniz : ");
        int yıl= scanner.nextInt();

        System.out.print(" km basına yaktıgı TL : ");
        double yakıt= scanner.nextDouble();

        System.out.print("aldığınız yolu km girin :");
        double yol= scanner.nextDouble();

        double maliyet=yol*yakıt;

        System.out.print(yıl +" model " + marka + " isimli aracın ödemesi gereken tutar : " + maliyet );


    }
}