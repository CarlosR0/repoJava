package EjerciciosTema4.Ejercicioo43;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		Actor blasblau = new Actor("Blas Blau",1983,"Española");
		Actor laura = new Actor("Laura Pozo",1981,"Italiana");
		Actor marcel = new Actor("Marcel Cade",2001,"Suiza");
		Actor violeta = new Actor("Violeta Volo",1999,"Rusa");
		Director sara = new Director("Sara Marea",1994,"Portuguesa");
		Guionista marco = new Guionista("Marco Smith",1988,"Reino Unido");
		Guionista cheng = new Guionista("Cheng Shu",1977,"China");

		List<Actor> actoresPeli1 = new ArrayList<Actor>();
		actoresPeli1.add(blasblau);
		actoresPeli1.add(laura);		
		Pelicula peli1 = new Pelicula(2027,"Muerte en la Sombra",actoresPeli1,marco,sara);
		
		List<Actor> actoresPeli2 = new ArrayList<Actor>();
		actoresPeli2.add(blasblau);
		actoresPeli2.add(laura);
		actoresPeli2.add(marcel);
		actoresPeli2.add(violeta);
		Pelicula peli2 = new Pelicula(2027,"Do you know Joe Blas?",actoresPeli2,cheng,sara);

		System.out.println(peli1.getActores());
		
		System.out.println("El sueldo del Guionista es de: " + peli2.getGuionista().getSueldo() + " y su nacionalidad es " + peli2.getGuionista().getNacionalidad());
		
		actoresPeli2.remove(marcel);
		actoresPeli1.add(marcel);
		
		System.out.println("Peli1: " + peli1.getActores());
		System.out.println("Peli2: " + peli2.getActores());
		
	}

}
