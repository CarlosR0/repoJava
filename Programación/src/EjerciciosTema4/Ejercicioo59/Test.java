package EjerciciosTema4.Ejercicioo59;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pais pais = new Pais();
		pais.agregarPais("we", "wer");
		pais.agregarPais("wer", "wert");
		pais.agregarPais("wert", "werty");
		pais.agregarPais("werty", "wertyu");
		pais.agregarPais("wertyu", "wertyui");
		pais.agregarPais("wertyui", "wertyuio");
		pais.agregarPais("wertyuio", "wertyuiop");
		pais.imprimirPaises();
		pais.imprimirPaises();
		System.out.println("Promedio letras: " + pais.calcularLongitudMediaPaises());
		System.out.println("Dime una letra bonita");
		String letra = sc.nextLine();
		System.out.println("Paises cuya capital empiezan por " + letra);
		pais.imprimirNumeroPaisesLetra(letra);
		System.out.println("Paises cuya capital empiezan por la misma letra que su nombre");
		pais.mismaLetra();
		pais.eliminarPaisConCapitalLetra(letra);
		System.out.println("Paises cuya capital empiezan por " + letra);
		pais.imprimirNumeroPaisesLetra(letra);
		sc.close();
	}

}
