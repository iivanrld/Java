package calculadora_factorial;

import java.util.Scanner;


public class calculadora_factoriales {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero q no sea negativo: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Numero no valido. debe ser un numero que no sea negativo.");
        } else {
            long factorial = calcularFactorial(num);
            System.out.printf("El factorial de %d es: %d%n", num, factorial);
        }
    }

    private static long calcularFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calcularFactorial(num - 1);
        }

	}

}
