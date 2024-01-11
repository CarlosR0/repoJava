package EjerciciosTema4.Ejercicioo24;

import java.util.Scanner;

public class TestAlumno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Profesor profesor = new Profesor();

		System.out.println("Dime el nombre del profesor");
		profesor.setNombre(sc.nextLine());
		System.out.println("Dime la edad del profesor");
		profesor.setEdad(sc.nextInt());
		sc.nextLine();

		Alumno alumno = new Alumno("12345678t");
		Curso curso = new Curso();

		System.out.println("Dime el DNI del alumno");
		alumno.setDni(sc.nextLine());
		System.out.println("Dime el nombre del alumno");
		alumno.setNombre(sc.nextLine());
		System.out.println("Dime la edad del alumno");
		alumno.setEdad(sc.nextInt());
		System.out.println("Dime la nota del alumno");
		alumno.setNota(sc.nextDouble());
		sc.nextLine();
		System.out.println("Dime el identificador del curso del alumno");
		curso.setIdentificador(sc.nextLine());
		System.out.println("Dame la descripcion del curso del alumno");
		curso.setDescripcion(sc.nextLine());
		alumno.setCurso(curso);
		sc.close();

//		System.out.println("Dni : " + alumno.getDni());
//		System.out.println("Nombre : " + alumno.getNombre());
//		System.out.println("Edad : " + alumno.getEdad());
//		System.out.println("Nota : " + alumno.getNota());
//		System.out.println("Identificador del curso : " + alumno.getCurso().getIdentificador());
//		System.out.println("Descripción del curso : " + alumno.getCurso().getDescripcion());

		System.out.println(alumno);
		System.out.println();
		System.out.println(profesor);

	}

}
