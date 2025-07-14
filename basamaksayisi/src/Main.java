import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("sayınızı girin : ");
        int sayı= scanner.nextInt();
       int basamaksayisi=0;
        if (sayı==0)
            basamaksayisi=1;
        else {
            while (sayı>0) {
                sayı /= 10;
                basamaksayisi++;
            }
        }
        System.out.println("basamak sayısı " + basamaksayisi);
    }
}