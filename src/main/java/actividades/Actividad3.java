package actividades;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un palíndromo: ");
        String palindrome = scan.nextLine();

        String palindromeReverse = "";
        String palindromeArray = "";

        for (int i=0; i<palindrome.length(); i++) {
            palindromeArray = palindrome.replace(" ", "");
        }
        System.out.println(palindromeArray);

        for (int i=palindrome.length() -1; i>=0; i-- ) {
            palindromeReverse  += palindrome.charAt(i);
        }
        palindromeReverse = palindromeReverse.replace(" ", "");
        System.out.println(palindromeReverse);

        if (palindromeArray.equals(palindromeReverse)) {
            System.out.println("Escribiste un palLndromo genial!");
        } else {
            System.out.println("Qué decepción, esa vaina no es un palíndromo...");
        }

        scan.close();
    }

}
