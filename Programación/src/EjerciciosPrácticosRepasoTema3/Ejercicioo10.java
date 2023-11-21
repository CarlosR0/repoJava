package EjerciciosPrácticosRepasoTema3;

import java.util.Scanner;

public class Ejercicioo10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos alumnos hay en la clase");
		int num = sc.nextInt();
		sc.nextLine();
		String[] alumnos = new String[num];
		int[] mediaAlumnos = new int[num];
		int[][] notasAlumnos = new int[num][3];
		int contAlumnos = 0;
		int sumaMedia = 0;
		int sumaNotas = 0;
		double mediaTotal = 0;

		do {
			System.out.println("Cuál es el nombre el alumno " + (contAlumnos + 1));
			String alumno = sc.nextLine();
			alumnos[contAlumnos] = alumno;
			for (int i = 0; i < 3; i++) {
				do {
					System.out
							.println("Cuál es la nota de " + alumnos[contAlumnos] + " para el examen " + (i + 1) + "?");
					notasAlumnos[contAlumnos][i] = sc.nextInt();
					sc.nextLine();

				} while (notasAlumnos[contAlumnos][i] > 10);
			}

			contAlumnos++;
		} while (contAlumnos != num);
		sc.close();
		System.out.println("LISTADO DE NOTAS");

		for (int i = 0; i < alumnos.length; i++) {
			sumaNotas = notasAlumnos[i][0] + notasAlumnos[i][1] + notasAlumnos[i][2];
			mediaAlumnos[i] = sumaNotas / 3;
			System.out.println("	Alumno: " + alumnos[i] + " - Nota media: " + mediaAlumnos[i]);
		}
		for (int i = 0; i < mediaAlumnos.length; i++) {
			sumaMedia = sumaMedia + mediaAlumnos[i];
		}
		mediaTotal = sumaMedia / num;
		System.out.println("Media de los alumnos: " + mediaTotal);

	}

}
