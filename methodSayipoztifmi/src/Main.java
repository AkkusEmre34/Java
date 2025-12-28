import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);m
        System.out.print("Lütfen bir sayı girin : ");
        int sayı = scanner.nextInt();
        SayipoztifMi(sayı);
        System.out.println(SayipozitifMi2(sayı));
    }

    public static void SayipoztifMi(int sayı) {
        if (sayı > 0) {
            System.out.println("sayı pozitiftir");

        } else System.out.println("sayı pozitif değildir ");

    }

    public static boolean SayipozitifMi2(int sayı) {
        if (sayı > 0) {
            return true;

        } else return false;


    }
}