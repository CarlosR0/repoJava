package EjerciciosTema4.Ejercicioo53;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		Hucha hucha = new Hucha();
		System.out.println(hucha);

		hucha.meterDinero(new BigDecimal("100"));
		System.out.println(hucha);
		
		hucha.meterDinero(new BigDecimal("50.501"));
		System.out.println(hucha);
		
		hucha.sacarDinero(new BigDecimal("20.5"));
		System.out.println(hucha);
		
		BigDecimal n = hucha.sacarDinero(new BigDecimal("200.00"));
		System.out.println(hucha);
		
		hucha.meterDinero(n);
		System.out.println(hucha);
		
		
		hucha.meterDinero(hucha.contarDinero());
		System.out.println(hucha);

		
		hucha.meterDinero(hucha.romperHucha());
		System.out.println(hucha);
	}

}
