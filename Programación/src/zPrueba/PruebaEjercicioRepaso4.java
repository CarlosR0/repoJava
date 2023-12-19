package zPrueba;

import java.util.Scanner;

public class PruebaEjercicioRepaso4 {

	public static void main(String[] args) {

		 Scanner teclado = new Scanner(System.in);
	        System.out.print("Por favor ingrese el tamaño del cuadrado: ");
	        int n = teclado.nextInt();

	        char[][] cuadro = new char[n][n];
	        char[] caracteres = {'*', '@'};

	        for(int capa = 0; capa < n/2 + 1; capa++) {
	            for (int i = capa; i < n - capa; i++) {
	                cuadro[capa][i] = caracteres[capa % caracteres.length];
	                cuadro[i][capa] = caracteres[capa % caracteres.length];
	                cuadro[n - capa - 1][i] = caracteres[capa % caracteres.length];
	                cuadro[i][n - capa - 1] = caracteres[capa % caracteres.length];
	            }
	        }

	        System.out.println("\n----- RESULTADO -----");

	        for (char[] array : cuadro) {
	            for (char caracter : array) {
	                System.out.print(caracter);
	            }
	            System.out.print("\n ");
	        }

	        System.out.println("---------------------");

	        teclado.close();
		
	}
}
