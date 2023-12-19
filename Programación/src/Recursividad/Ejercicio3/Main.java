package Recursividad.Ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mete un número y sumare desde el 0 hasta ese número.");
		Integer n = sc.nextInt();
		sc.close();
		Integer resultado = Metodo.sumarNumero(n);
		System.out.println(resultado);
	}

}
