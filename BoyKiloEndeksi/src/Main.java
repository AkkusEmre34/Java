import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("boyunuzu girin");
        double boy = scanner.nextDouble();

        System.out.println("kilonuzu girin");
        double kilo= scanner.nextDouble();

        double endeks=kilo/(boy*boy);
        System.out.println("endeksiniz " + endeks);

        if (endeks>30)
            System.out.println("iyi");
        if (20<endeks &&  endeks<30)
            System.out.println("normal");
        if (endeks<20)
            System.out.println("kotu");
    }
}