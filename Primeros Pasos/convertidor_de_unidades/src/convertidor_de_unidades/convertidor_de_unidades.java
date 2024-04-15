package convertidor_de_unidades;

import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario

public class convertidor_de_unidades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        System.out.print("Ingrese el número de kilómetros: ");
        double kilometro = scanner.nextDouble(); // Leer el número de kilómetros ingresado por el usuario

        double millas = kilometro * 0.621371;
        System.out.println(kilometro + " kilómetros son igual a " + millas + " millas.");
    }
}