package EjerciciosPrácticosRepasoTema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicioo23 {

	public static void main(String[] args) {

		Random numero = new Random();		
		Scanner sc = new Scanner(System.in);
		
		Integer contador1 = 0;
		Integer contador2 = 0;
		Integer contador3 = 0;
		Integer contador4 = 0;
		Integer contador5 = 0;
		Integer contador6 = 0;
		System.out.println("Di un número. Tirare el dado ese número de veces.");
		Integer veces = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < veces; i++) {
			Integer num = numero.nextInt(1, 7);
			if (num ==1) {
				contador1++;
			}
			if (num ==2) {
				contador2++;
			}
			if (num ==3) {
				contador3++;
			}
			if (num ==4) {
				contador4++;
			}
			if (num ==5) {
				contador5++;
			}
			if (num ==6) {
				contador6++;
			}
		}
		System.out.println("1: " + contador1);
		System.out.println("2: " + contador2);
		System.out.println("3: " + contador3);
		System.out.println("4: " + contador4);
		System.out.println("5: " + contador5);
		System.out.println("6: " + contador6);
		int suma = contador1+contador2+contador3+contador4+contador5+contador6;
		System.out.println("La suma de todos los números es "+ suma + ".");
		sc.close();

	}
}