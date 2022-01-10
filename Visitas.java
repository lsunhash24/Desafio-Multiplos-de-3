package cl.desafiolatam;

public class Visitas {

	public static void main(String[] args) {
		if (args.length > 1) {
			promedio(args);

		} else if (args.length == 0) {
			System.out.println("Ingrese número de visitas");
		}
	}

	public static void promedio(String[] args) {
		int suma = 0;
		int contador = 0;

		for (int i = 0; i < args.length; i++) {
			System.out.println("paramatro " + i + "= " + args[i]);
			suma = suma + Integer.parseInt(args[i]);
			contador++;
		}
		float promedio = (suma / contador);

		System.out.println("Para la entrada anterior el promedio de las visitas es : " + Math.round(promedio));

	}

}
