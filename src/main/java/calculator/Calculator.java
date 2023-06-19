package calculator;

import java.util.Scanner;

public class Calculator {

    public static float add(float num1, float num2){
        System.out.println("La somma è ");
        return num1 + num2;
    }

    public static float subtract(float num1, float num2){
        System.out.println("La sottrazione dà ");
        return num1 - num2;
    }

    public static float divide(float num1, float num2){
        System.out.println("La divisione dà ");
        return num1 / num2;
    }

    public static float multiply(float num1, float num2){
        System.out.println("La moltiplicazione dà ");
        return num1 * num2;
    }
    public static void main(String[] args) {
        Scanner utente = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        Float num1 = utente.nextFloat();
        System.out.println("Inserisci il secondo numero: ");
        Float num2 = utente.nextFloat();

        System.out.println(add(num1, num2));
        System.out.println(subtract(num1, num2));
        System.out.println(divide(num1, num2));
        System.out.println(multiply(num1, num2));
    }
}
