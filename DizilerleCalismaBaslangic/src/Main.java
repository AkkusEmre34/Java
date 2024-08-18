// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String ogrenci1="EMRE";
        String ogrenci2="BAHA";
        String ogrenci3="GAYE";
        String ogrenci4="OMER";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("------------");


        String[] ogrenciler=new String[4];
        ogrenciler[0]="EMRE";
        ogrenciler[1]="BAHA";
        ogrenciler[2]="GAYE";
        ogrenciler[3]="OMER";

        for (int i=0;  i< ogrenciler.length; i++ ){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

















    }
}