package EjerciciosTema4.Ejercicioo48;

public class Test {

	public static void main(String[] args) {
		Cliente blas = new Cliente("12345678X","Blas de los Montes");
		Carrito car1 = new Carrito(blas);
		Ropa poncho = new Ropa("Poncho",20.0,"XL","Azul");
		car1.addArticulo(poncho);
		car1.addArticulo(poncho);
		System.out.println(car1);
		Libro Zaratustra = new Libro("Así habló Zaratustra",15.0,"Nietzsche");
		car1.addArticulo(Zaratustra);
		System.out.println(car1);
		car1.borrarArticulo(poncho);
		System.out.println(car1.getPrecioMedio());
		car1.vaciarCesta();
		System.out.println(car1);
		System.out.println(car1.getPrecioMedio());
		
	}

}
