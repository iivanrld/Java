package comprobacion_numero_primos;

import java.util.Scanner;

public class comprobador_numero_primos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("introduce un numero: ");
        int numero = scanner.nextInt();
        scanner.close();
        if (esPrimo(numero)) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;

	}

}
