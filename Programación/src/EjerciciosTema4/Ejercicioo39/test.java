package EjerciciosTema4.Ejercicioo39;

public class test {

	public static void main(String[] args) {

		PilaColaCadenas pilaCola = new PilaColaCadenas();
		System.out.println(pilaCola);

		pilaCola.añadirCadena("Primero");
		pilaCola.añadirCadena("Segundo");
		System.out.println(pilaCola);

		System.out.println(pilaCola.sacarCadena());

		pilaCola.añadirCadena("Tercero");
		System.out.println(pilaCola);

		while (pilaCola.getTamaño() > 0) {
			pilaCola.sacarCadena();
		}
		System.out.println(pilaCola);

		pilaCola.añadirCadena("Cuarto");
		System.out.println(pilaCola);

		while (pilaCola.getTamaño() > 0) {
			pilaCola.sacarCadena();
		}
		pilaCola.cambiarModo();
		System.out.println("Se cambia de modo");

		System.out.println(pilaCola);

		pilaCola.añadirCadena("Primero");
		pilaCola.añadirCadena("Segundo");
		System.out.println(pilaCola);

		System.out.println(pilaCola.sacarCadena());

		pilaCola.añadirCadena("Tercero");
		System.out.println(pilaCola);

		while (pilaCola.getTamaño() > 0) {
			pilaCola.sacarCadena();
		}

		System.out.println(pilaCola);

		pilaCola.añadirCadena("Cuarto");
		System.out.println(pilaCola);

	}

}
