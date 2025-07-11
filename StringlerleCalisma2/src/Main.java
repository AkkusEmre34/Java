// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String mesaj = "real madrid dünyanın en iyi takımıdır. ";
        System.out.println(mesaj);
        System.out.println(mesaj.substring(2,7));
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
        String yenimesaj=mesaj.replace(" " , "-");
        System.out.println(yenimesaj);
    }
}