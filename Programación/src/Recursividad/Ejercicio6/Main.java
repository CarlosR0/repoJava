package Recursividad.Ejercicio6;

public class Main {

	public static void main(String[] args) {
		Integer[] Palabras = new Integer[]{1,2,3,4,5,6,7,8,9};
		int numero = 0;
		int cont = 0;
		int longitud = Palabras.length;
		Metodo.imprimirArray(Palabras,numero,longitud,cont);
		System.out.println(cont);
		
	}

}
