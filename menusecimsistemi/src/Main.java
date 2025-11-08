import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("MENÜ :");
        System.out.println("giriş : ");
        System.out.println("hesap makinesi : ");
        System.out.println("cıkıs : ");
        System.out.println("1-3 arasında seciim yapınız : ");

        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                System.out.println("kullanıcı adı :");
                String username = scanner.nextLine();
                System.out.println("şifre :");
                String password = scanner.nextLine();

                if (username.equals("admin") && password.equals("password123")) {
                    System.out.println("giriş bsarılı ");

                } else {
                    System.out.println("giriş bsarısırz");
                    break;
                }
            case 2:
                System.out.println("toplama : ");
                System.out.println("cıkarma : ");
                System.out.println("çarpma : ");
                System.out.println("bölme : ");
                System.out.println("lütfen secim yapınız : ");
                System.out.println("lutfen iki sayı girin : ");

                int secim = scanner.nextInt();

                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                switch (secim) {
                    case 1:
                        System.out.println("sonuc " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("sonuc " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("sonuc " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("sonuc " + (num1 / num2));
                        break;
                    default:
                        System.out.println("gecersiz islem");

                }
            case 3:
                System.out.println("programdan cıkılıyor ");
                break;
            default:
                System.out.println("gecersiz secenek");


        }
    }
}