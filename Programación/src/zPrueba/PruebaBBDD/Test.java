package zPrueba.PruebaBBDD;

public class Test {

	public static void main(String[] args) {
		Gatos gatos = new Gatos();
		gatos.testConexion();
		System.out.println(gatos.consultarGato(1,"S"));
	}

}
