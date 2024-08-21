import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen sayı girin :  " );
        int sayı= scanner.nextInt();
        int a=0, b=1, i=0;

       while (i<sayı){
           System.out.print(a + " , ");
            int toplam=a+b;
            a=b;
            b=toplam;
            i++;

        }


    }
}