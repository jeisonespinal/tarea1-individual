package hn.uth.tarea_individual_primerparcial;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
    	Scanner scanner = new Scanner(System.in);
        int menu;
        
        do {
            System.out.println("\nMENU DE OPERACIONES GEOMETRICAS:");
            System.out.println("1. Calcular área de círculo");
            System.out.println("2. Calcular área de cuadrado");
            System.out.println("3. Calcular área de rectángulo");
            System.out.println("4. Calcular área de triángulo");
            System.out.println("5. Salir");
            menu = scanner.nextInt();
            scanner.nextLine();
            
            switch (menu) {
            case 1:
            	double pi = 3.1416;
                System.out.println("Ingrese el radio del círculo:");
                double radio = scanner.nextDouble();
                System.out.println("El área del círculo es: "+circulo(pi, radio));
                break;
            case 2:
            	double primerLado;
            	double segundoLado;
            	do {
                System.out.println("Ingrese el primer lado del cuadrado:");
                primerLado = scanner.nextDouble();
	            System.out.println("Ingrese el segundo lado del cuadrado:");
	            segundoLado = scanner.nextDouble();
	            if(primerLado < 0 || segundoLado < 0 || primerLado != segundoLado || segundoLado != primerLado)
	            	System.out.println("Valor Incorrecto. No se pueden ingresar valores negativos y debe ingresar el mismo valor para los dos lados. Por favor ingrese nuevamente los valores:");
	            else
	            	System.out.println("El área del cuadrado es: "+cuadrado(primerLado, segundoLado));
            	} while (primerLado < 0 || segundoLado < 0 || primerLado != segundoLado || segundoLado != primerLado);
                break;
            case 3:
            	double baseRectangulo;
            	double alturaRectangulo;
            	do {
                System.out.println("Ingrese la base del rectángulo:");
                baseRectangulo = scanner.nextDouble();
                System.out.println("Ingrese la altura del rectángulo:");
                alturaRectangulo = scanner.nextDouble();
                if(baseRectangulo < 0 || alturaRectangulo < 0)
	            	System.out.println("Valor Incorrecto. No se pueden ingresar valores negativos. Por favor ingrese nuevamente los valores:");
                else
                	System.out.println("El área del rectángulo es: "+rectangulo(baseRectangulo, alturaRectangulo));
            	} while (baseRectangulo < 0 || alturaRectangulo < 0);
                break;
            case 4:
            	double baseTriangulo;
            	double alturaTriangulo;
            	do {
                System.out.println("Ingrese la base del triángulo:");
                baseTriangulo = scanner.nextDouble();
                System.out.println("Ingrese la altura del triángulo:");
                alturaTriangulo = scanner.nextDouble();
                if(baseTriangulo < 0 || alturaTriangulo < 0)
	            	System.out.println("Valor Incorrecto. No se pueden ingresar valores negativos. Por favor ingrese nuevamente los valores:");
                else
                	System.out.println("El área del triángulo es: "+triangulo(baseTriangulo, alturaTriangulo));
            	} while (baseTriangulo < 0 || alturaTriangulo < 0);
                break;
            case 5:
                System.out.println("Saliendo del Programa...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
            }
        } while (menu != 5);
        
        scanner.close(); 
    }


	public static double circulo(double pi, double radio) {
		return pi*(radio*radio);
	}

	public static double cuadrado(double primerLado, double segundoLado) {
		return primerLado*segundoLado;
	}

	public static double rectangulo(double base, double altura) {
		return base*altura;
	}

	public static double triangulo(double base, double altura) {
		return base*altura/2;
    }
}
