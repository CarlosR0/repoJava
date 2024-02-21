package EjerciciosRepasoTema4.Ejercicio4;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		Libreria libreria = new Libreria("Avda. de los sueños perdidos, 89", new BigDecimal(954696954));
		Tamaño tamaño1 = new Tamaño(new BigDecimal(50), new BigDecimal(70));
		Tamaño tamaño2 = new Tamaño(new BigDecimal(30), new BigDecimal(80));

		LibroFisico fisico1 = new LibroFisico("quijote", "pepe", LocalDate.of(1999, 2, 19), 100, tamaño1,
				new BigDecimal(45));
		LibroFisico fisico2 = new LibroFisico("mago de oz", "juan", LocalDate.of(1987, 7, 11), 250, tamaño2,
				new BigDecimal(60));
		LibroDigital digital1 = new LibroDigital("la aventuras de marcos", "marcos", LocalDate.of(2015, 4, 13), 90);
		LibroDigital digital2 = new LibroDigital("barrio sesamo", "pacopico", LocalDate.of(1991, 4, 14), 70);
		libreria.addLibro(fisico1);
		libreria.addLibro(fisico2);
		libreria.addLibro(digital1);
		libreria.addLibro(digital2);

		System.out.println(libreria.obtenerLibroMasAntiguo());
		System.out.println(libreria.obtenerNumPaginasMedio());
		System.out.println(libreria.obtenerPesoTotalDeLibros());

	}

}
