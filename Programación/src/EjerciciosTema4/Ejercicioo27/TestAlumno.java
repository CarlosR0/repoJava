package EjerciciosTema4.Ejercicioo27;

import java.util.Scanner;

public class TestAlumno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Curso curso = new Curso();
		curso.setDescripcion("DAM-DAW");
		curso.setIdentificador("1");

		Alumno[] alumnos = new Alumno[3];

		for (int i = 0; i < alumnos.length; i++) {

			do {
				System.out.println("Dime el DNI del " + (i + 1) + "º alumno");
				alumnos[i] = new Alumno(sc.nextLine());
				if (!alumnos[i].validarDni()) {

					System.out.println("Repite el DNI, ya que no encaja con las caracteristicas predeterminadas.");
				}
			} while (!alumnos[i].validarDni());

			System.out.println("Dime el nombre del " + (i + 1) + "º alumno");
			alumnos[i].setNombre(sc.nextLine());
			System.out.println("Dime la edad del " + (i + 1) + "º alumno");
			alumnos[i].setEdad(sc.nextInt());
			System.out.println("Dime la nota del " + (i + 1) + "º alumno");
			alumnos[i].setNota(sc.nextDouble());
			sc.nextLine();
			alumnos[i].setCurso(curso);
		}
		sc.close();

		if (alumnos[0].equals(alumnos[1]) && alumnos[0].equals(alumnos[2])) {
			System.err.println("Todos los alumnos son iguales");
		} else {
			if (alumnos[0].equals(alumnos[1])) {
				System.err.println("Los alumnos " + 1 + " y " + 2 + " son iguales.");
			}
			if (alumnos[0].equals(alumnos[2])) {
				System.err.println("Los alumnos " + 1 + " y " + 3 + " son iguales.");
			}
			if (alumnos[1].equals(alumnos[2])) {
				System.err.println("Los alumnos " + 2 + " y " + 3 + " son iguales.");
			}

		}
	}

}
