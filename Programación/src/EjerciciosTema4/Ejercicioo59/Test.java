package EjerciciosTema4.Ejercicioo59;

public class Test {

	public static void main(String[] args) {
		Pais pais = new Pais();
		pais.agregarPais("we", "wer");
		pais.agregarPais("wer", "wert");
		pais.agregarPais("wert", "werty");
		pais.agregarPais("werty", "wertyu");
		pais.agregarPais("wertyu", "wertyui");
		pais.agregarPais("wertyui", "wertyuio");
		pais.agregarPais("wertyuio", "wertyuiop");
		System.out.println(pais);
		System.out.println(pais.imprimirPaises());
	}

}
