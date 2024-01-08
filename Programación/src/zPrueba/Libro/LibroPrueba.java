package zPrueba.Libro;

public class LibroPrueba {

	public static void main(String[] args) {
		Libro x = new Libro();
		Libro y = new Libro("LOTR","J.K","TU MAI",34);
		
		Libro.setMaterial("papel");
		System.out.println(x.getAutor());
		System.out.println(x.getEditorial());
		System.out.println(x.getNumPaginas());
		System.out.println(x.getTitulo());
		System.out.println(Libro.getMaterial());
		
		y.setAutor("Hortalizo");
		y.setEditorial("Verduras");
		y.setNumPaginas(173);
		y.setTitulo("La alcachofa");
//	se puede poner ->	x.setMaterial("papel");
		System.out.println(y.getAutor());
		System.out.println(y.getEditorial());
		System.out.println(y.getNumPaginas());
		System.out.println(y.getTitulo());
//	se puede poner ->	System.out.println(x.getMaterial());
		System.out.println(Libro.getMaterial());
	}
}
