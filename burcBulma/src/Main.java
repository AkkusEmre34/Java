import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("doğum tarihi ay olarak gir : ");
        int month = input.nextInt();
        String burc = "";

        System.out.println("doğduğunuz tarihi gün olarak gir : ");
        int gün = input.nextInt();

        switch (month) {
            case 1:
                burc = (gün <= 21) ? "oğlak" : "kova";
                break;
            case 2:
                burc = (gün <= 19) ? "kova" : "balık";
                break;
            case 3:
                burc = (gün <= 20) ? "balık " : "koç";
                break;
            case 4:
                burc = (gün <= 20) ? "koc" : "boğa";
                break;
            case 5:
                burc = (gün < 21) ? "boğa" : "ikizler";
                break;
            case 6:
                burc = (gün <= 22) ? "ikizler" : "yengec ";
                break;
            case 7:
                burc = (gün <= 22) ? "yengec" : "aslan";
                break;
            case 8:
                burc = (gün <= 22) ? "aslan" : "basak";
                break;
            case 9:
                burc = (gün <= 22) ? "basak" : "terazi";
                break;
            case 10:
                burc = (gün <= 22) ? "terazi" : "akrep";
                break;
            case 11:
                burc = (gün <= 21) ? "akrep" : "yay";
                break;
            case 12:
                burc = (gün <= 21) ? "yay" : "oğlak";
                break;
            default:
                System.out.println("gecersiz ay girdiniz");
                return;


        }
        System.out.println("Burcunuz : " + burc);
    }

}