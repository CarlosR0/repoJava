package EjerciciosTema5.Ejercicio6;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ParametroIncorrectoException {
		Scanner sc = new Scanner(System.in);
		Persona pers = new Persona();
		String genero = "";
		BigDecimal altura = BigDecimal.ZERO;
		try {
			System.out.println("Dime tu genero(H o M)");
			genero = sc.nextLine();
			pers.setGenero(genero);
			
		} catch (ParametroIncorrectoException e) {
			System.out.println("no existe ese genero");
		}
		try {
			System.out.println("Dime tu altura(entre 0 y 3)");
			altura = sc.nextBigDecimal();
			pers.setAltura(altura);
		} catch (ParametroIncorrectoException e) {
			System.out.println("Esa altura es imposible.");
		}finally {
			System.out.println(pers);
			sc.close();
		}
		
	}

}
