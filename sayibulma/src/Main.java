// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int[] sayılar = new int[]{3, 4, 5, 6, 7, 8, 9};
        int arancak = 2;
        boolean varMi = false;

        for (int sayi : sayılar)
            if (sayi == arancak) {
                varMi = true;
                break;
            }
        if (varMi)
            System.out.println("sayı mevcuttur");
        else System.out.println("sayı mevcut değil");

    }
}