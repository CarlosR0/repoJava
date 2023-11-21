package prueba2;

import java.util.Scanner;

public class NumeroFavorito {

	public static void main(String[] args) {

		System.out.println("Hola, ¿podrías decirme tu número favorito?");
		
		Scanner sc = new Scanner(System.in);
			long numero = sc.nextLong();
		
			long op = numero * numero;
			
		System.out.println("Tu número favorito es el " + numero + ", y su cuadrado es " + op);
		
		sc.close();
	}

}
