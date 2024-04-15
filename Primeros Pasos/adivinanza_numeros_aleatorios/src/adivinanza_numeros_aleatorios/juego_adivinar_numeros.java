package adivinanza_numeros_aleatorios;

import java.util.Random; // Importar la clase Random para generar números aleatorios
import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario


public class juego_adivinar_numeros {

	public static void main(String[] args) {
		Random random = new Random(); // Crear un objeto Random para generar números aleatorios

        int numeroAleatorio = random.nextInt(10) + 1; // Generar un número aleatorio entre 1 y 10

        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        System.out.print("Adivina el número entre 1 y 10: ");
        int numeroIngresado = scanner.nextInt(); // Leer el número ingresado por el usuario

        while (numeroIngresado != numeroAleatorio) {
            if (numeroIngresado < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
            System.out.print("Adivina el número entre 1 y 10: ");
            numeroIngresado = scanner.nextInt(); // Leer el siguiente número ingresado por el usuario
        }

        System.out.println("¡Felicidades! Adivinaste el número: " + numeroAleatorio);

	}

}
