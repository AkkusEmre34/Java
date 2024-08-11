import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sinav notunuz giriniz :");
        int sinav1 = scanner.nextInt();

        System.out.println("İkinci Sinav notunuz giriniz: ");
        double sinav2 = scanner.nextDouble();

        double ort = (sinav1+sinav2)/2;
        System.out.println("ortalamanız" + ort);

    }
}