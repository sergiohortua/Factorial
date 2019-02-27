/* programa extraido de la siguiente pagina web: http://ocw.upm.es/lenguajes-y-sistemas-informaticos/programacion-en-java-i/
                                                 Contenidos/Ejercicios/ejerciciosresueltosdelcapitulodesentenciasrepetitivasobucles.pdf                              
   ejercicio 4: Construir un programa que calcule el factorial de un valor numérico introducido como parámetro
                o argumento en la línea de comandos.                                                        
 */

package com.sergioh.factorial;

import java.util.Scanner;

public class Factorial {

	private static Scanner tc;

	public static void main(String[] args) {
		tc = new Scanner(System.in);//asistente de teclado
		int n = 0;
		double fac = 1;
		System.out.println("INGRESANDO UN NUMERO SABRAS EL FACTORIAL DEL MISMO");
		System.out.println();
		System.out.print("Por favor ingrese un numero: ");
		n = tc.nextInt();
		if (n != 0) {
			System.out.println("El numero descompuesto en digitos es: ");
			for (int i = 0; i < n; i++) {      // descompone el numero
				System.out.print((i + 1));

			}

			for (int i = 0; i < n; i++) {      //genera el factorial del numero
				fac *= i + 1;

			}
			System.out.println();
			System.out.println("El factorial de " + n + " es: ");  //imprime el factorial
			System.out.println(fac);

		} else {
			System.out.println("EL cero no es un numero para el ejercicio.");   

		}

	}

}
