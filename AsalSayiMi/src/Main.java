import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        int sayı = scanner.nextInt();
        int i;
        int kontrol=0;
        for (i=2; i<sayı; i++){
          if (i%sayı==0)
              kontrol++;
        }

        if(kontrol==0){
            System.out.println("Sayiniz asaldir.");
        }else{
            System.out.println("Sayiniz asal degil");
        }

    }
}