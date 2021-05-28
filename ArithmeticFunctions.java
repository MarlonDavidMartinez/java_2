package scl.edu.gt;

import java.util.Scanner;

public class ArithmeticFunctions {

	public static void sumar() {
		
		Scanner numeral1 = new Scanner (System.in);
		System.out.println("numero 1: ");
		double numero_1 = numeral1.nextDouble();
		
		Scanner numeral2 = new Scanner (System.in);
		System.out.println("numero 2: ");
		double numero_2 = numeral2.nextDouble();
		
	    double respuesta = numero_1 + numero_2;
	    System.out.println("la respuesta es: "+ respuesta);	
	   }
	
public static void restar() {
		
		Scanner numero1 = new Scanner (System.in);
		System.out.println("numero 1: ");
		double numero_1 = numero1.nextDouble();
		
		Scanner numero2 = new Scanner (System.in);
		System.out.println("numero 2: ");
		double numero_2 = numero2.nextDouble();
		
	    double diferencia = numero_1 - numero_2;
	    System.out.println("la respuesta es: "+ diferencia);	
	   }
	
public static void dividir() {
	
	    Scanner dividendo = new Scanner (System.in);
	    System.out.println("numero 1: ");
	    double numero_1 = dividendo.nextDouble();
	
	    Scanner divisor = new Scanner (System.in);
	    System.out.println("numero 2: ");
	    double numero_2 = divisor.nextDouble();
	
        double cociente = numero_1 / numero_2;
        System.out.println("la respuesta es: "+ cociente);	
   }
public static void multiplicar() {
	
        Scanner factor1 = new Scanner (System.in);
        System.out.println("numero 1: ");
        double numero_1 = factor1.nextDouble();

        Scanner factor2 = new Scanner (System.in);
        System.out.println("numero 2: ");
        double numero_2 = factor2.nextDouble();

        double cociente = numero_1 * numero_2;
        System.out.println("la respuesta es: "+ cociente);	
}
public static void residuo() {
	 Scanner residuo1 = new Scanner (System.in);
     System.out.println("numero 1: ");
     double numero_1 = residuo1.nextDouble();

     Scanner residuo2 = new Scanner (System.in);
     System.out.println("numero 2: ");
     double numero_2 = residuo2.nextDouble();

     double cociente = numero_1 % numero_2;
     System.out.println("la respuesta es: "+ cociente);	
}
}









