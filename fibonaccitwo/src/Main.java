import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("kac terim istiyorsun ? : ");
        int n = input.nextInt();
        int a = 0, b = 1;
        int toplam =0;
        for (int i = 2; i < n; i++) {
            
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}