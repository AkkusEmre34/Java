import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen kelime girin : ");
        String kelime=scanner.nextLine();
        System.out.println(tersCevir(kelime));
        System.out.println(kelimePalindromMu(kelime));
}
      public static String tersCevir(String kelime){

        String ters="";
        for (int i=kelime.length()-1; i>=0; i--){
            ters+=kelime.charAt(i);
        }
            return ters;


      }
      public static boolean kelimePalindromMu(String kelime){
        return kelime.equals(tersCevir(kelime));
      }
}