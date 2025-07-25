import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("sayı girin: ");
        int sayı= input.nextInt();
        pozitifMi(sayı);

    }

    public static void pozitifMi (int sayı){
        if (sayı>0){
            System.out.println("sayı pozitif");

        }else{
            System.out.println("sayı negatif");
        }
    }
}