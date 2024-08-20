import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String mesaj=" Bugün hava cok güzel.";
        System.out.println(mesaj);

        System.out.println(mesaj.substring(2,5));//ayırır
        System.out.println(mesaj.substring(2));
        String yeniMesaj=mesaj.replace(' ' , '-');//istedigin yere ekleme yaparsın
        System.out.println(yeniMesaj);

        System.out.println(mesaj.toLowerCase());//kucuk harf yapar
        System.out.println(mesaj.toUpperCase());// büyük harf yapar
        System.out.println(mesaj.trim());//baslangic ve sondaki boslukları atar,düzenli cümle olur


    }

}