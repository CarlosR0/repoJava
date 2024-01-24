package EjerciciosTema4.Ejercicioo37;

public class test {

	public static void main(String[] args) {

		Cola cola = new Cola();
		System.out.println(cola);

		cola.añadirCadena("Primero");
		cola.añadirCadena("Segundo");
		System.out.println(cola);

		System.out.println(cola.sacarCadena());

		cola.añadirCadena("Tercero");
		System.out.println(cola);

		while (cola.getTamaño() > 0) {
			cola.sacarCadena();
		}
		System.out.println(cola);

		cola.añadirCadena("Cuarto");
		System.out.println(cola);

	}

}
