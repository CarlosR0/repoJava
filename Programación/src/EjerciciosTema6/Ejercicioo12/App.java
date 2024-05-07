package EjerciciosTema6.Ejercicioo12;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	static PedidosService service = new PedidosService();
	static Connection conn = service.abrirConexion();
	public static void main(String[] args) throws ErrorException, SQLException, NotFoundException, PedidoException {
		service.testConexion();
		Boolean quedarse = true;
		do {
			mostrarMenu();
			Integer num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				crearNuevoPedido();
				break;
			case 2:
				pedidoCompleto();
				break;
			case 0:
				quedarse = false;
				System.out.println("Adios");
				break;

			default:
				System.out.println("Esa opcion no esta comprendida.");
				break;
			}
		} while (quedarse);
		sc.close();
//		try {
//			System.out.println(service.consultarLineasPedidos(1));
//		} catch (ErrorException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public static void mostrarMenu() {
		System.out.println("\tMENU\n");
		System.out.println("1. Crear nuevo pedido\n");
		System.out.println("2. Ver pedido\n");
		System.out.println("0. Salir");
		System.out.println("");
	}

	public static void pedidoCompleto() throws ErrorException, SQLException, NotFoundException, PedidoException {
		Integer num = 0;

		System.out.println("Dame el numero del pedido que quieres conusltar.");
		num = sc.nextInt();
		sc.nextLine();
		System.out.println(service.consultarPedidoCompleto(num));

	}

	public static void crearNuevoPedido() throws SQLException, ErrorException {
		Pedido pedido = new Pedido();
		System.out.println("Digame el numero del pedido.");
		Integer num = sc.nextInt();
		sc.nextLine();
		System.out.println("Digame el nombre del cliente.");
		String cliente = sc.nextLine();
		System.out.println("Digame la fecha de entrega.");
		String fecha = sc.nextLine();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaEntrega = LocalDate.parse(fecha, formato);
		System.out.println("Cuantas lineas de pedido va a tener.");
		Integer cont = sc.nextInt();
		sc.nextLine();
		List<PedidoLinea> pedidosLinea = new ArrayList<PedidoLinea>();
		PedidoLinea pedidoLinea = new PedidoLinea();
		for (int i = 0; i < cont; i++) {
			crearLineaPedido(pedidoLinea,num);
			pedidosLinea.add(pedidoLinea);
		}
		pedido.setNumero(num);
		pedido.setCliente(cliente);
		pedido.setFechaEntrega(fechaEntrega);
		pedido.setPedidosLinea(pedidosLinea);
		service.crearPedidoCompleto(pedido,conn);
	}

	public static PedidoLinea crearLineaPedido(PedidoLinea pedidoLinea,Integer num) {
		System.out.println("Articulo nuevo");
		System.out.println("Digame el articulo.");
		String art = sc.nextLine();
		System.out.println("Digame la cantidad de articulos.");
		Integer cant = sc.nextInt();
		sc.nextLine();
		System.out.println("Digame el precio unitario.");
		BigDecimal precioUnitario = sc.nextBigDecimal();
		sc.nextLine();
		System.out.println("Articulo terminado");
		pedidoLinea.setNumeroPedido(num);
		pedidoLinea.setArticulo(art);
		pedidoLinea.setCantidad(cant);
		pedidoLinea.setPrecioUnitario(precioUnitario);
		return pedidoLinea;
	}
}
