package Es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // con int :


        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci i km percorsi:");
        int kmInt = sc.nextInt();
        System.out.println("Inserisci i litri consumati:");
        int litriInt = sc.nextInt();

        try {
            int kmAlLitro = kmInt / litriInt;
            System.out.println("Hai consumato " + kmAlLitro + " litri al km");
        } catch (ArithmeticException e) {
            System.out.println("Non puoi aver consumato 0 litri! ");
        }

        //con double:
        System.out.println("Ora proviamo con i double...");
        System.out.println("Inserisci i km percorsi:");
        double kmDouble = sc.nextDouble();
        System.out.println("Inserisci i litri consumati:");
        double litriDouble = sc.nextDouble();

        try {
            double kmAlLitroD = kmDouble / litriDouble;
            System.out.println("Hai consumato " + kmAlLitroD + " litri al km");
        } catch (ArithmeticException e) { // inserita eccezione corretta
            System.out.println("Non puoi aver consumato 0 litri! ");
        }
        sc.close();
    }
    // ritorna Infinity ! in questo caso bisogna gestire con if else

}

