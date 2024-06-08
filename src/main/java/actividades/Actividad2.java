package actividades;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int num = scan.nextInt();

        for (int i=1; i<num +1; i++ ){
            if (i % 2 == 0){
                System.out.println(i + " es par");
            } else{
            System.out.println(i + " es impar");
            }
        }
    }
}
