import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir harf girin : ");
        String kelime = input.nextLine();
        char harf = kelime.charAt(0);//ilk harf alınır
        switch (kelime) {
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("kalın sesli harf");
                break;
            default:
                System.out.println("ince harf girdiniz");
        }


    }
}