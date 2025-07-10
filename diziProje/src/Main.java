// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        double[] Mylist = {1.2, 2.3, 6.4, 5.3, 7.7, 9.1};

        double toplam = 0;

        double max = Mylist[4];

        for (double number : Mylist) {

            if (max < number)

                max = number;

            System.out.println(number);

            toplam = toplam + number;

        }
        System.out.println("toplam " + toplam);
        System.out.println("max " + max);

    }
}