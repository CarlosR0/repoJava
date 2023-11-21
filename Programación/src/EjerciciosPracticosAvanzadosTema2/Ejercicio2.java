package EjerciciosPracticosAvanzadosTema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mete un número.");
		Integer x = sc.nextInt();
		Integer y = x;
		Integer z = x;
		
		sc.nextLine();

		for (Integer i = 1; i <= x; i++) {
			for (Integer j = 1; j <= y; j++) {
				 if (i==j || z == i+j-1){
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println("");
		}
		System.out.println("Hola");
		sc.close();

	}

}
