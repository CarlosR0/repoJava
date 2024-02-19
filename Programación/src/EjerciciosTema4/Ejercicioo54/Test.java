package EjerciciosTema4.Ejercicioo54;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {

		CuentaAhorros cuenta = new CuentaAhorros("001244554334");
		System.out.println(cuenta);
		
		Cargo cargo1 = new Cargo(new BigDecimal(100),"0123134213");
		Cargo cargo2 = new Cargo(new BigDecimal(50),"0123134213");
		Ingreso ingreso1 = new Ingreso(new BigDecimal(200),"trabajillo");
		Ingreso ingreso2 = new Ingreso(new BigDecimal(100),"ayuda");
		Retirada retirada1 = new Retirada(new BigDecimal(75));
		
		cuenta.addMovimiento(cargo1);
		cuenta.addMovimiento(cargo2);
		cuenta.addMovimiento(ingreso1);
		cuenta.addMovimiento(ingreso2);
		cuenta.addMovimiento(retirada1);
		
		System.out.println(cuenta);
		System.out.println();
		System.out.println(cuenta.getMovimientos());
		System.out.println();
		System.out.println(cuenta.getCargos());
		System.out.println();
		System.out.println(cuenta.getIngresos());
		System.out.println();
		System.out.println(cuenta.getRetiradas());
	}

}
