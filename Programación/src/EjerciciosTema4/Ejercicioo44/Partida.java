package EjerciciosTema4.Ejercicioo44;

public class Partida {
	public static void main(String[] args) {
		Asesino as1 = new Asesino("as1", "000");
		Asesino as2 = new Asesino("as2", "001");
		Asesino as3 = new Asesino("as3", "002");
		Equipo equipo = new Equipo();
		equipo.addPersonaje(as1);
		equipo.addPersonaje(as2);
		equipo.addPersonaje(as3);
		Jugador jugador = new Jugador("Hermes", equipo);

		Parasito blas = new Parasito("Blas", "B69");
		System.out.println("Blas quita " + blas.getDaño() + " de daño y pega cada " + blas.getDps() + " segundos.");

		equipo.addPersonaje(blas);

		System.out.println(equipo.getPuntos());

		equipo.addPersonaje(blas);

		System.out.println(jugador.getEquipo());

		Parasito pa1 = new Parasito("pa1", "003");
		Parasito pa2 = new Parasito("pa2", "004");
		equipo.addPersonaje(pa1);
		equipo.addPersonaje(pa2);

		System.out.println(jugador.getEquipo());

		System.out.println(equipo.getPuntos());
	}
}
