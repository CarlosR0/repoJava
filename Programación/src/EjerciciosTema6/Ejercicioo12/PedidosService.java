package EjerciciosTema6.Ejercicioo12;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidosService {
	public List<PedidoLinea> consultarLineasPedidos(Integer num)
			throws ErrorException, SQLException, NotFoundException, PedidoException {
		List<PedidoLinea> pedidosLinea = new ArrayList<PedidoLinea>();
		String sql = "select * from pedidos_lineas where numero_pedido = ?";
		try (Connection con = abrirConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
			try {

				stmt.setInt(1, num);
				// Ejecutamos el sql
				ResultSet rs = stmt.executeQuery();
				// Leemos el result set
				while (rs.next()) {
					PedidoLinea pedidoLinea = new PedidoLinea();
					pedidoLinea.setNumeroPedido(rs.getInt("NUMERO_PEDIDO"));
					pedidoLinea.setArticulo(rs.getString("ARTICULO"));
					pedidoLinea.setCantidad(rs.getInt("CANTIDAD"));
					pedidoLinea.setPrecioUnitario(rs.getBigDecimal("NUMERO_PEDIDO"));
					pedidosLinea.add(pedidoLinea);

				}
			} catch (SQLException e) {
				throw new PedidoException("no se ha conectado bien.");
			}

		} catch (NullPointerException e) {
			throw new NotFoundException("El numero de pedido no corresponde a nadie.");
		}
		return pedidosLinea;
	}

	public Pedido consultarPedidoCompleto(Integer num)
			throws ErrorException, SQLException, NotFoundException, PedidoException {
		Pedido pedido;
		String sql = "select * from pedidos where numero = ?";
		try (Connection con = abrirConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
			try {

				stmt.setInt(1, num);
				// Ejecutamos el sql
				ResultSet rs = stmt.executeQuery();
				// Leemos el result set
				if (rs.next()) {
					pedido = new Pedido();
					pedido.setNumero(rs.getInt("NUMERO"));
					pedido.setCliente(rs.getString("CLIENTE"));
					Date date = rs.getDate("FECHA_ENTREGA");
					LocalDate fecha = date.toLocalDate();
					pedido.setFechaEntrega(fecha);

					pedido.setPedidosLinea(consultarLineasPedidos(1));

				} else {
					throw new NotFoundException("El numero de pedido no corresponde a nadie.");
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new PedidoException("no se ha conectado bien.");
			}

		} catch (NullPointerException e) {
			throw new NotFoundException("El numero de pedido no corresponde a nadie.");
		}
		return pedido;
	}

	public void insertarLineaPedido(PedidoLinea pedidoLinea, Connection conn) throws SQLException, ErrorException {
		try {
			conn.setAutoCommit(false);
			try {
				String sql = "INSERT INTO pedidos_lineas VALUES (?,?,?,?)";
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setInt(1, pedidoLinea.getNumeroPedido());
				stmt.setString(2, pedidoLinea.getArticulo());
				stmt.setInt(3, pedidoLinea.getCantidad());
				stmt.setBigDecimal(4, pedidoLinea.getPrecioUnitario());
				stmt.execute();
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ErrorException("No he podido conectarme a la BBDD");
		}
	}

	public void crearPedidoCompleto(Pedido pedido, Connection conn) throws SQLException, ErrorException {
		try {
			conn.setAutoCommit(false);
			try {
				String sql = "INSERT INTO pedidos VALUES (?,?,?)";
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setInt(1, pedido.getNumero());
				stmt.setString(2, pedido.getCliente());
				stmt.setDate(3, Date.valueOf(pedido.getFechaEntrega()));
				stmt.execute();
				for (int i = 0; i < pedido.getPedidosLinea().size(); i++) {
					insertarLineaPedido(pedido.getPedidosLinea().get(i), conn);
				}
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ErrorException("No he podido conectarme a la BBDD");
		}
	}

	public void testConexion() {
		Connection con = abrirConexion();
		System.out.println("Esta es mi conexión: " + con);
		if (con != null) {
			System.out.println("Todo OK!!");
		} else {
			System.out.println("Esto no rula...");
		}
	}

	public Connection abrirConexion() {
		String urlConexion = "jdbc:oracle:thin:@//localhost:1521/xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String usuario = "carlosrc";
		String contraseña = "root";

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(urlConexion, usuario, contraseña);
			return con;
		} catch (Exception e) {
			System.err.println("No he podido abrir la conexion");
			e.printStackTrace();
		}
		return null;
	}
}
