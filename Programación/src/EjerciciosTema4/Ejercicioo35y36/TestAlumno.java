package EjerciciosTema4.Ejercicioo35y36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAlumno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Curso curso = new Curso();
		curso.setDescripcion("DAM-DAW");
		curso.setIdentificador("1");

		List<Alumno> lista = new ArrayList<Alumno>();

		for (int i = 0; i < 3; i++) {
			Alumno am;
			do {
				System.out.println("Dime el DNI del " + (i + 1) + "º alumno");
				am = new Alumno(sc.nextLine());
				if (!am.validarDni()) {

					System.err.println("Repite el DNI, ya que no encaja con las caracteristicas predeterminadas.");
				}
			} while (!am.validarDni());

			lista.add(am);
			System.out.println("Dime el nombre del " + (i + 1) + "º alumno");
			am.setNombre(sc.nextLine());
			System.out.println("Dime la edad del " + (i + 1) + "º alumno");
			am.setEdad(sc.nextInt());
			System.out.println("Dime la nota del " + (i + 1) + "º alumno");
			am.setNota(sc.nextDouble());
			sc.nextLine();
			curso.addAlumno(am);
			am.setCurso(curso);
			if (!(am.validar())) {
				System.err.println("Algun dato es erroneo, repita el alumno.");
				System.out.println();
				i--;
				continue;
			}
		}
		sc.close();

		if (lista.get(0).equals(lista.get(1)) && lista.get(0).equals(lista.get(2))) {
			System.err.println("Todos los alumnos son iguales");
		} else {
			if (lista.get(0).equals(lista.get(1))) {
				System.err.println("Los alumnos " + 1 + " y " + 2 + " son iguales.");
			}
			if (lista.get(0).equals(lista.get(2))) {
				System.err.println("Los alumnos " + 1 + " y " + 3 + " son iguales.");
			}
			if (lista.get(1).equals(lista.get(2))) {
				System.err.println("Los alumnos " + 2 + " y " + 3 + " son iguales.");
			}

		}
		for (Alumno alumno : lista) {
			System.out.println(alumno);
			System.out.println();
		}
	}

}
