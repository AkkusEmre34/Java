// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] ogrencıler = new String[5];
        ogrencıler[0] = "emre";
        ogrencıler[1] = "baha";
        ogrencıler[2] = "furkan";
        ogrencıler[3] = "enes";
        ogrencıler[4] = "sıla";

        for (int i = 0; i < ogrencıler.length; i++) {
            System.out.println(ogrencıler[i]);

        }
        System.out.println("-----------------");


        for (String ogrenci:ogrencıler)
            System.out.println(ogrenci);


    }


}