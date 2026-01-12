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
            System.out.print("Scegli una posizione da 1 a 5, 0 per terminare: ");
            int pos = sc.nextInt();

            if (pos != 0) {
                System.out.print("Scegli il numero da inserire: ");
                int number = sc.nextInt();

                try {
                    array[pos - 1] = number;
                    System.out.println("Array modificato: " + Arrays.toString(array));

                } catch (OutOfRangeException e) {
                    System.out.println("Dev'essere una posizione da 1 a 5!");
                }

            } else {
                System.out.println("Processo terminato");
                sc.close();
                break;

            }


        }
        sc.close();

    }


}
