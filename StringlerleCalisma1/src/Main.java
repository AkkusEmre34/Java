// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

String mesaj="Bugün hava cok güzel.";
        System.out.println(mesaj);
        System.out.println("Eleman Sayısı : " + mesaj.length());
        System.out.println("7. eleman : " + mesaj.charAt(6));
        System.out.println(mesaj.concat("yasasın!") );
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));


    }
}