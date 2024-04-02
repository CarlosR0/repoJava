package EjerciciosTema5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		List<Integer> lista = new ArrayList<Integer>();
		try {
			do {
				System.out.println("Di numeros, cuando quieras parar pon el -1.");
				try {
					num = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Tienes que poner números.");
					sc.nextLine();
				}
				
				if (num == -1) {
					System.out.println("¡OK!");
				} else {
					lista.add(num);
				}
			} while (!(num == -1));
		} finally {
			sc.close();
		}
		System.out.println(lista);
	}
}
