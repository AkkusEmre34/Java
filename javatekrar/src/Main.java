// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] futbolplayers = new String[5];
        futbolplayers[0]="ronaldo";
        futbolplayers[1]="messi";
        futbolplayers[2]="dzeko";
        futbolplayers[3]="hazard";
        futbolplayers[4]="neymar";

        for (int i = 0; i < futbolplayers.length; i++) {
            System.out.print(futbolplayers[i] + " --- ");
        }

        for (String futbolcu:futbolplayers){
            System.out.println(futbolcu);
        }


    }
}