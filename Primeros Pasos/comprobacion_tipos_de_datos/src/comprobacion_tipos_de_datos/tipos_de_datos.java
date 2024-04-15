package comprobacion_tipos_de_datos;

import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario

public class tipos_de_datos {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

	        System.out.print("Ingrese cualquier dato: ");
	        Object dato = scanner.nextLine(); // Leer la entrada del usuario como un objeto

	        System.out.println("El tipo de dato ingresado es: " + dato.getClass().getSimpleName());

	}

}
