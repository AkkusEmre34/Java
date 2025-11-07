import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("baslangıc yeri : ");
        String baslangıc = scanner.nextLine();
        System.out.println("varıs yeri : ");
        String varis = scanner.nextLine();

        System.out.println("kac km : ");
        double mesafe = scanner.nextDouble();
        System.out.println("kargo var mı : (evet/hayır)");
        String cevap = scanner.next();
        boolean hascargo = scanner.nextBoolean();
        double totalcost = 0;
        if (!baslangıc.equals(varis)) {
            totalcost += 1000 * 0.25;
        } else {
            totalcost += 0.25 * mesafe;
        }
        if (hascargo) {
            double weight = scanner.nextDouble();
            totalcost += weight * 0.35;
        }
        System.out.println("total cost :" + totalcost);

    }

}