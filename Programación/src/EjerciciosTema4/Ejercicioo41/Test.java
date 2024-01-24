package EjerciciosTema4.Ejercicioo41;

public class Test {

	public static void main(String[] args) {
		Equipo equipo1 = new Equipo("DAM");
		Equipo equipo2 = new Equipo("DAW");
		
		equipo1.setJugadores(null);
		
		
		Partido partido1 = new Partido();
		partido1.setEquipoLocal(equipo1);
		partido1.setEquipoVisitante(equipo2);		
		System.out.println(partido1);
	}

}
