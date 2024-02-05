package EjerciciosTema4.Ejercicioo44;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private List<Personaje> equipo;

	public Equipo() {
		equipo = new ArrayList<Personaje>();
	}

	public void addPersonaje(Personaje personaje) {
		if (!equipo.contains(personaje)) {
			if (canAdd()) {
				equipo.add(personaje);
			}

		}
	}

	public int getPuntos() {
		int suma = 0;
		for (int i = 0; i < equipo.size(); i++) {
			suma = suma + equipo.get(i).getVida();
		}
		return suma;
	}

	public void removePersonaje(int num) {
		if (num < equipo.size()) {
			equipo.remove(num);
		}
	}

	public void removePersonaje(Personaje personaje) {
		equipo.remove(personaje);
	}

	public boolean canAdd() {

		if (equipo.size() >= 5) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Equipo [equipo=" + equipo + "]";
	}
	
}
