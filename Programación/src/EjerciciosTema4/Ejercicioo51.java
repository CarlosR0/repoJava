package EjerciciosTema4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicioo51 {

	public static void main(String[] args) {
		List<BigDecimal> num = new ArrayList<BigDecimal>();
		Scanner sc = new Scanner(System.in);
		BigDecimal numAnterior = BigDecimal.ZERO;
		for (int i = 0; i < 5; i++) {
			System.out.println("Dame el " + (i + 1) + "º número.");
			BigDecimal nert = sc.nextBigDecimal();
			BigDecimal n = new BigDecimal(nert.toString());
			if (i<0) {
				numAnterior = num.get(i - 1);
			} else {

			}
			if (i > 0 && n.max(numAnterior) == numAnterior) {
				System.out.println("El numero tiene que ser mayor que el anterior.");
				i--;
				
			} else {
				numAnterior = n;
				num.add(n);
			}
			
		}
		sc.close();
		System.out.println(num);
		BigDecimal suma = BigDecimal.ZERO; 
		for (int i = 0; i < 5; i++) {
			suma = suma.add(num.get(i));
		}
		suma = suma.setScale(1, RoundingMode.HALF_DOWN);
		System.out.println(suma);
		
		BigDecimal division = num.get(0).divide(num.get(1),3,RoundingMode.HALF_UP);
		System.out.println(division);
		
		
	}

}
