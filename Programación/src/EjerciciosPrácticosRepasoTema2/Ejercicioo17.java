package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicioo17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer num = 0;
		Integer fibo1,fibo2;
		do {
			System.out.println("Di un número mayor que dos.");
			num = sc.nextInt();
			
		} while (num <= 2);
		sc.close();
		
		System.out.println("los numeros de la serie de Fibonacci.");
		fibo1=0;
		fibo2=1;        
		System.out.println(fibo1 + " ");

			for (int i = 1; i < num; i++) {
				
			
			System.out.println(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;

			
		}

	}

}
