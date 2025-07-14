import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int fizik, mat, kimya, biyoloji, geometri, tarih, coğrafya;

        double ortalama;

        System.out.print("fizik notunuz : ");
        fizik = scanner.nextInt();

        System.out.print("mat notunuz : ");
        mat = scanner.nextInt();

        System.out.print("kimya notunuz : ");
        kimya = scanner.nextInt();


        System.out.print("biyoloji notunuz : ");
        biyoloji = scanner.nextInt();

        System.out.print("geometri notunuz : ");
        geometri = scanner.nextInt();

        System.out.print("tarih notunuz :");
        tarih = scanner.nextInt();


        System.out.print("coğrafya notunuz : ");
        coğrafya = scanner.nextInt();

        System.out.println("not ortalmanız : ");

        ortalama = (mat + kimya + fizik + coğrafya + tarih + biyoloji + geometri) / 6.0;
        System.out.println("ortalamanız : " + ortalama);
    }


}
