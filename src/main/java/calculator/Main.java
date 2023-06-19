package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner utente = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        float num1 = utente.nextFloat();
        System.out.println("Inserisci il secondo numero: ");
        float num2 = utente.nextFloat();

        Calculator calcolatrice = new Calculator(num1, num2);

        System.out.println(calcolatrice.add(num1, num2));
        System.out.println(calcolatrice.subtract(num1, num2));
        System.out.println(calcolatrice.divide(num1, num2));
        System.out.println(calcolatrice.multiply(num1, num2));
    }
}
