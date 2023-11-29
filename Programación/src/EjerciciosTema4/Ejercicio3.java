package EjerciciosTema4;

import java.util.Scanner;

public class Ejercicio3 {

	public static String getMayMin(int tipoLetra, String frase) {
		if (tipoLetra == 1) {
			return frase.trim().toUpperCase();
		} else {
			return frase.trim().toLowerCase();

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mete el numero 1 para mayusculas y el numero 2 para minusculas.");
		int tipoLetra = sc.nextInt();
		sc.nextLine();
		System.out.println("Mete una frase.");
		String frase = sc.nextLine();
		sc.close();
		String resultado = getMayMin(tipoLetra, frase);
		System.out.println(resultado);
	}

}
