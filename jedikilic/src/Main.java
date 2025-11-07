import java.util.Scanner;
public class Main {

   public class jedischoolform{

   }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("adınızı girin : ");
        String name = scanner.nextLine();

        System.out.println("yasınızı girin : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("kılıc rengi : ");
        String lightsabercolour = scanner.nextLine();

        System.out.println("agırlık girin : ");
        double weight = scanner.nextDouble();


        System.out.println("jedi ustası durumu girin :(true/false) ");
        boolean isjedimaster = scanner.nextBoolean();

        System.out.println("jedi ismi : " + name);
        System.out.println("jedi yas : " + age);
        System.out.println("jedinin kılıc rengi : " + lightsabercolour);
        System.out.println("jedinin agırlıgı : " + weight);
        System.out.println("jedinin ustalık durumu :" + isjedimaster);
        scanner.close();
    }
}