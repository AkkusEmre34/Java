import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a : ");
        int a = scanner.nextInt();

        System.out.println("b : ");
        int b = scanner.nextInt();

        System.out.println("c : ");
        int c = scanner.nextInt();


        boolean result = ((a & b) & c) == c;

        System.out.println(result);


    }


}