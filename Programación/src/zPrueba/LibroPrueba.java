package zPrueba;

public class LibroPrueba {

	public static void main(String[] args) {
		Libro x = new Libro();
		x.setAutor("Hortalizo");
		x.setEditorial("Verduras");
		x.setNumPaginas(173);
		x.setTitulo("La alcachofa");
		x.setMaterial("papel");
		System.out.println(x.getAutor());
		System.out.println(x.getEditorial());
		System.out.println(x.getNumPaginas());
		System.out.println(x.getTitulo());
		System.out.println(x.getMaterial());
	}
}
