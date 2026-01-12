package Es1;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10) + 1);
        }
        System.out.println("Array iniziale: " + Arrays.toString(array));

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("Scegli un numero, 0 per terminare: ");
            int number = sc.nextInt();

            if (number != 0) {
                System.out.print("Scegli una posizione: ");
                int pos = sc.nextInt();

                try {
                    array[pos - 1] = number;
                    System.out.println("Array modificato: " + Arrays.toString(array));

                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Dev'essere una posizione da 1 a 5! Riprova...");
                } catch (NumberFormatException e) {
                    System.out.println("Dev'essere un numero!");
                }

            } else {
                System.out.println("Processo terminato");
                break;

            }


        }
        sc.close();

    }


}
