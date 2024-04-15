package generador_de_numeros_aleatorios;

import java.util.Random; // Importar la clase Random para generar números aleatorios

public class numeros_aleatorios {

	public static void main(String[] args) {
		Random random = new Random(); // Crear un objeto Random para generar números aleatorios

        int numeroAleatorio = random.nextInt(100) + 1; // Generar un número aleatorio entre 1 y 100

        System.out.println("El número aleatorio generado es: " + numeroAleatorio);
	}

}
