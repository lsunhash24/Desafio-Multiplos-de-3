package cl.desafiolatam;

public class SmartWatch {

	public static void main(String[] args) {
		if (args.length > 1) {

			clearSteps(args);

		} else if (args.length == 0) {
			System.out.println("Ingrese datos");
		}
	}

	public static void clearSteps(String[] args) {
		int suma = 0;
		int contador = 0;
		System.out.println(" ** Lista filtrada **");
		for (int i = 0; i < args.length; i++) {

			if (Integer.parseInt(args[i]) >= 200 && Integer.parseInt(args[i]) <= 100000) {

				System.out.println("paramatro " + i + "= " + args[i]);
				suma += Integer.parseInt(args[i]);
				contador++;
			}
		}
		float promedio = (suma / contador);

		System.out.println("Para la entrada anterior el promedio de pasos diarios es: " + Math.round(promedio));

	}

}
