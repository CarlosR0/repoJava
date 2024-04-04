package EjerciciosTema4.Ejercicioo42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		

		Equipo equipoLocal = crearEquipo(sc,"local");

		Equipo equipoVisitante = crearEquipo(sc,"visitante");

		System.out.println(equipoLocal);
		System.out.println(equipoVisitante);

		Partido partido1 = new Partido();
		partido1.setEquipoLocal(equipoLocal);
		partido1.setEquipoVisitante(equipoVisitante);
		System.out.println(partido1);

		Resultado resultado = new Resultado();
		System.out.println("Establece un resultado, primero los goles locales y luego los visitantes.");
		resultado.setGolesLocales(sc.nextInt());
		resultado.setGolesVisitante(sc.nextInt());
		partido1.setResultado(resultado);
		sc.close();

		System.out.println(partido1);
		System.out.println("El equipo ganador es: " + partido1.getEquipoGanador());

		Jugador blas = new Jugador("Blas infiltrado", 99);
		equipoVisitante.getJugadores().add(blas);
		System.out.println(equipoVisitante);

		Integer ultimo = equipoLocal.getJugadores().size();
		equipoLocal.setCapitan(equipoLocal.getJugadores().get(ultimo-1));
		System.out.println(equipoLocal);
		
		Equipo.setCompeticion("Liga Nacional");
		System.out.println(Equipo.getCompeticion());
		Equipo.setCompeticion("Copa Internacional");
		System.out.println(Equipo.getCompeticion());

	}

	private static Equipo crearEquipo(Scanner sc, String tipo) {
		System.out.println("Dime el nombre del equipo " + tipo + ".");
		Equipo equipo = new Equipo(sc.nextLine());
		List<Jugador> jugadores1 = new ArrayList<Jugador>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Dime el jugador y dorsal para el equipo " + tipo + ".");
			String nombre = sc.nextLine();
			Integer dorsal = sc.nextInt();
			sc.nextLine();
			Jugador jugador = new Jugador(nombre, dorsal);
			jugadores1.add(jugador);

		}
		equipo.setJugadores(jugadores1);
		return equipo;
	}

}
