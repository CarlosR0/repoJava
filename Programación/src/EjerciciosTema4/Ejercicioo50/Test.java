package EjerciciosTema4.Ejercicioo50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<Pais> set = new HashSet<Pais>();
		System.out.println(set);
		
		Pais pais = new Pais("ES","España");
		Pais pais1 = new Pais("CK","Islas Cook");
		Pais pais2 = new Pais("CK","Islas Caiman");
		set.add(pais);
		set.add(pais1);
		set.add(pais2);
		System.out.println(set);
		
		Pais pais3 = new Pais("es","España");
		set.add(pais3);
		System.out.println(set);
		
		Iterator<Pais> itr = set.iterator();
		
		while (itr.hasNext()) {
			Pais pais4 = (Pais) itr.next();
			if (!pais4.getCodigo().equals("ES")) {
				itr.remove();
			}
			
			
		}
		
		System.out.println(set);
		
		set.clear();
		
		System.out.println(set);
		
	}

}
