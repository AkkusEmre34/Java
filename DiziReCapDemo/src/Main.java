// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double[] liste = {3.3, 4.4, 5.5, 6.6};
        double max = liste[2];
        double toplam=0;
        for (double number : liste) {
            if (max < number) {
                max = number;

            }
            toplam=toplam+number;
            System.out.println(number);

        }
        System.out.println("EnBuyuk : " + max);
        System.out.println("Toplam  : " +  toplam);

    }


}
