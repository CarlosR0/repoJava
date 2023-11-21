package EjerciciosPracticosAvanzadosTema3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int[] lista = new int[11];
		Random numero = new Random();
		Random numero2 = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuantas veces quieres tirar el dado");
		double veces = sc.nextDouble();
		int suma = 0;
		double porcentaje = 0;
		int comprobacion = 0;
		double comprobacion2 = 0;
		for (int i = 0; i < veces; i++) {
			suma = 0;
			Integer num = numero.nextInt(1, 7);
			Integer num2 = numero2.nextInt(1, 7);
			suma = num + num2;
			lista[suma - 2]++;

		}

		for (int i = 0; i < lista.length; i++) {
			porcentaje = ((lista[i] / veces) * 100);
			System.out.print("El numero " + (i + 2) + " ha salido: " + lista[i] + " veces. ");
			System.out.println("El porcentaje de salida del numero " + (i + 2) + " es de un " + porcentaje + "%");
			comprobacion = comprobacion + lista[i];
			comprobacion2 = comprobacion2 + porcentaje;
		}
		System.out.println(comprobacion);
		System.out.println(comprobacion2);
		sc.close();

	}

}
