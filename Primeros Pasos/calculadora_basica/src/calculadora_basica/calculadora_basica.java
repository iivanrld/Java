package calculadora_basica;

import java.util.Scanner;

public class calculadora_basica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Elije el tipo de operacion (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division no permitida.");
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }

        System.out.println(num1 + " " + operacion + " " + num2 + " = " + resultado);

    }

}