package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("Dime tres ciudades.");
		Scanner sc = new Scanner(System.in);
		String ciudad1 = sc.nextLine();
		String ciudad2 = sc.nextLine();
		String ciudad3 = sc.nextLine();
		int longitud1 = ciudad1.length();
		int longitud2 = ciudad2.length();
		int longitud3 = ciudad3.length();
		sc.close();

		if (longitud1 > longitud2 && longitud2 > longitud3)
			System.out.println(ciudad1 + ", " + ciudad2 + ", " + ciudad3);
		else {
			if (longitud1 > longitud3 && longitud3 > longitud2)
				System.out.println(ciudad1 + ", " + ciudad3 + ", " + ciudad2);
			else {
				if (longitud2 > longitud1 && longitud1 > longitud3)
					System.out.println(ciudad2 + ", " + ciudad1 + ", " + ciudad3);
				else {
					if (longitud2 > longitud3 && longitud3 > longitud1)
						System.out.println(ciudad2 + ", " + ciudad3 + ", " + ciudad1);
					else {
						if (longitud3 > longitud1 && longitud1 > longitud2)
							System.out.println(ciudad3 + ", " + ciudad1 + ", " + ciudad2);
						else {
							if (longitud3 > longitud2 && longitud2 > longitud1)
								System.out.println(ciudad3 + ", " + ciudad2 + ", " + ciudad1);
						}
					}
				}
			}
		}
		
	}

}
