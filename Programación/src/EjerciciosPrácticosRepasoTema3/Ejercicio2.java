package EjerciciosPrácticosRepasoTema3;

public class Ejercicio2 {

	public static void main(String[] args) {

		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		int contadorAlumnos = 0;
		int suma = 0;
		int media;
		
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i]>=5) {
				suma = suma + listaNotas[i];
				contadorAlumnos++;
			}
		}
		media = suma/contadorAlumnos;
		System.out.println("Nota media de aprobados: " + media);
		
	}

}
