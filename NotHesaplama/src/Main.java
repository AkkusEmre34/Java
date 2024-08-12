import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Isim giriniz : ");
        String isim = scanner.nextLine();

        System.out.print("vize notunuzu girin : ");
        int vize= scanner.nextInt();
        System.out.print("final notunuzu girin : ");
        int not= scanner.nextInt();

        double ortalama=(vize*0.4)+(not*0.6);
        System.out.print( isim + " adli ogrencinin " + " ortalamasi : " + ortalama);

        if(ortalama > 100){
            System.out.println(" Hatali not girdiniz !");
        }
        if (ortalama>80 && ortalama<=100)
            System.out.print(" ders gecme harfiniz : A GECTİNİZ ");
        if (ortalama<80 && ortalama>60)
            System.out.print(" ders gecme harfiniz : B GECTİNİZ");
        if (ortalama>40 && ortalama<60)
            System.out.print(" dersi gecme harfiniz : C GECTİNİZ");
        if (ortalama>20 && ortalama<40)
            System.out.print(" dersi gecme harfiniz : D KALDINIZ");
        if (ortalama>=0 && ortalama<20)
            System.out.print(" dersi gecme harfiniz : F KALDINIZ");
        if(ortalama < 0){
            System.out.println(" Hatali not girdiniz !");
        }
    }
}