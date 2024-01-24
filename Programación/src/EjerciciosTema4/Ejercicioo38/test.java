package EjerciciosTema4.Ejercicioo38;

public class test {

	public static void main(String[] args) {

		Pila pila = new Pila();
		System.out.println(pila);

		pila.añadirCadena("Primero");
		pila.añadirCadena("Segundo");
		System.out.println(pila);

		System.out.println(pila.sacarCadena());

		pila.añadirCadena("Tercero");
		System.out.println(pila);

		while (pila.getTamaño() > 0) {
			pila.sacarCadena();
		}

		System.out.println(pila);

		pila.añadirCadena("Cuarto");
		System.out.println(pila);

	}

}
