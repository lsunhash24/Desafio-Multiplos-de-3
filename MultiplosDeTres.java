package cl.desafiolatam;
// alumno: Luis Sanhueza Soto

public class MultiplosDeTres {

	static int sumarMultiplos = 0; 									// declaraci?n e inicializaci?n de variables globales
	static boolean error = false;

	public static void main(String[] datos) { 						// el m?todo main recibe los datos tipo string por consola

		if (datos.length > 1) { 									// verificar que se ingresen datos

			validarNumeros(datos);									// invocar funci?n que valida los datos

			if (!error) { 											// si los datos est?n correctos
				suma(datos); 										// se invocan los m?todos suma() y promedio()
				promedio(datos);
			}

		} else if (datos.length == 0) { 							// se solicita que se ejecute nuevamente el programa
			System.out.println("Ingrese datos");
		}
	}

	public static void suma(String[] datos) {						// m?todo que obtiene la suma de los datos ingresados
																	// que sean m?ltiplos de 3
		for (int i = 0; i < datos.length; i++) {

			if (Integer.parseInt(datos[i]) % 3 == 0) { 				// Se obtine el m?dulo de cada dato convertido a entero
				sumarMultiplos += Integer.parseInt(datos[i]); 		// se acumula la suma

			}
		}
		System.out.println();
		System.out.println("** M?ltiplos de 3 **");
		System.out.println();
		System.out.println("Para la entrada anterior la suma es: " + sumarMultiplos); // muestra la suma por consola
		System.out.println();
	}

	public static void promedio(String[] datos) { 					// m?todo que obtiene el promedio de los datos ingresados
																	// que sean m?ltiplos de 3
		int contar = 0;
		sumarMultiplos = 0;

		for (int i = 0; i < datos.length; i++) {
																	// Se obtine el m?dulo de cada dato convertido a entero
			if (Integer.parseInt(datos[i]) % 3 == 0) {				// si el m?dulo es igual a 0, entonces el numero es m?ltiplo de 3
				sumarMultiplos += Integer.parseInt(datos[i]); 		// se acumula la suma
				contar++; 											// se cuenta si el n?mero es m?ltiplo de 3
			}
		}
		double promedioMultiplos = (sumarMultiplos / contar); 		// c?lculo del promedio

		System.out.println("Para la entrada anterior el promedio es: " + Math.round(promedioMultiplos*100.0)/100.0); // muestra el promedio por
		System.out.println();																						// consola
		
	}

	public static boolean validarNumeros(String[] datos) { 	// funci?n que valida los datos ingresados por consola
															// retorna la variable error=true si se ingresa un valor
		for (int i = 0; i < datos.length; i++) { 			// que no sea entero

			try {											// error controlado
															// verifica que el dato sea entero
				Integer.parseInt(datos[i]);

			} catch (Exception e) { 						// si el alg?n valor ingresado no es entero
				System.out.println("Error de ingreso"); 	// se asigna verdadero a la variable de control "error".
				error = true;
			}
			if (error) {
				System.out.println("S?lo numeros enteros");

			}

		}
		return error;
	}

}
