package conversor_de_temperatura;

import java.util.Scanner;

public class conversor_temperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una temperatura en grados Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusaFahrenheit(celsius);
        System.out.printf("%.2f grados Celsius a %.2f grados Fahrenheit.\n", celsius, fahrenheit);

        System.out.println("\nIntroduce una temperatura en Fahrenheit:");
        double fahrenheitInput = scanner.nextDouble();
        double celsiusInput = fahrenheitaCelsius(fahrenheitInput);
        System.out.printf("%.2f grados Fahrenheit a %.2f grados Celsius.\n", fahrenheitInput, celsiusInput);

        scanner.close();
    }

    public static double celsiusaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;

	}

}
