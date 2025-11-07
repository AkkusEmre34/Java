import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayınızı girin : ");
        int number = scanner.nextInt();
        System.out.println("kaydırma rakamı : ");
        int shift = scanner.nextInt();

        int firstdigit = (number / 10000) % 10;
        int seconddigit = (number / 1000) % 10;
        int thirddigit = (number / 100) % 10;
        int fourthdigit = (number / 10) % 10;
        int fifthdigit = number % 10;


        int newfirstdigit=(firstdigit + shift)%10;
        int newseconddigit=(seconddigit+shift)%10;
        int newthirddigit=(thirddigit+shift)%10;
        int newfourthdigit=(fourthdigit+shift)%10;
        int newfifthdigit=(fifthdigit+shift)%10;

        String newPassword="" +newfirstdigit+newseconddigit+newthirddigit+newfourthdigit+newfifthdigit;

        System.out.println("yeni sayınız: " + newPassword);
    }
}