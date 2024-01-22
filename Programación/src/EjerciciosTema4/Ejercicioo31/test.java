package EjerciciosTema4.Ejercicioo31;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<String> lista= new ArrayList<String>();
		lista.add("vete");
		lista.add("puta");
		lista.add(1,"maldita");
		System.out.println(lista.size());
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);
	}

}
