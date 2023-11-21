package EjerciciosTema3;

import java.util.Scanner;

public class Ejercicioo22 {

	public static void main(String[] args) {
		
//		int suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra y te la deletreare.");
		String[] lista = sc.nextLine().trim().split("");
		sc.close();
		System.out.print("La palabra deletrada es: ");
		
		for (String numero : lista) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			for (int i = -1000000000; i < 1000000000; i++) {
//				suma = suma +i;
//			}
			System.out.print(numero + "  ");
		}

	}

}
