package EjerciciosPrácticosRepasoTema2;

import java.util.Scanner;

public class Ejercicioo10 {

	public static void main(String[] args) {

		System.out.println("introduce una dirreccion web de estas caracteristicas. PROTOCOLO://PARTE1.PARTE2.PARTE3");
		Scanner sc = new Scanner(System.in);
		String direccion = sc.nextLine();
		sc.close();
		if (direccion.contains("://")) {
			
				int x = direccion.lastIndexOf("/");
				int y = direccion.indexOf(".");
				int z = direccion.lastIndexOf(".");
				if (x == -1 || y == -1 || z == -1 || z == y) {
					System.out.println("fallo");
				}else {
					String a = direccion.substring(0, x + 1);
					String b = direccion.substring(x + 1, y);
					String c = direccion.substring(y + 1, z);
					String d = direccion.substring(z + 1);
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				}
			}
			else {
			System.out.println("La estructura esta incompleta.");
		}
	}
}
