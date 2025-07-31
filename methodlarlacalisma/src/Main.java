// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            yazdır("emre");
        System.out.println("toplamı : " + topla(21,32) );
        System.out.println("bölüm : " + böl(43,21) );
        sehirler();
    }

    public static void yazdır (String isim){

        System.out.println(isim);

    }
    public static int topla(int a , int c){
        return a+c;
    }
    public static double böl(int a, int c){
        return a/c;
    }
public static void sehirler(){
    System.out.println("ankara");
    System.out.println("diyarbakır");
    System.out.println("antalya");

}
}