package EjerciciosTema4.Ejercicioo11;

public class Calculadora {

	private static final String SUMAR = "ADD";
	private static final String RESTAR = "SUB";
	private static final String MULTIPLICAR = "MUL";
	private static final String DIVIDIR = "DIV";
	
	public static int sumar(int num1,int num2) {
		int resultado = num1+num2;
		return resultado;
	}
	public static int restar(int num1,int num2) {
		int resultado = num1-num2;
		return resultado;
	}
	public static int dividir(int num1,int num2) {
		int resultado = num1/num2;
		return resultado;
	}
	public static int multiplicar(int num1,int num2) {
		int resultado = num1*num2;
		return resultado;
	}
	public static Integer calcular(String operacion,int num1,int num2) {
		switch (operacion) {
		case SUMAR: {
			return sumar(num1,num2);
		}
		case RESTAR: {
			return restar(num1,num2);
		}
		case MULTIPLICAR: {
			return multiplicar(num1,num2);
		}
		case DIVIDIR: {
			return dividir(num1,num2);
		}
		default:
			return null;
		}
	}
}
