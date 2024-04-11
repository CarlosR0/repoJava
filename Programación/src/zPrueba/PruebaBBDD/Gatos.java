package zPrueba.PruebaBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Gatos {
	public List<Gato> consultarGato(Integer edadMinima, String inicial) {
		List<Gato> gatos = new ArrayList<Gato>();
		String sql = "select * from GATOS where edad > ? and nombre like ?";
		try (Connection con = abrirConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, edadMinima);
			stmt.setString(2, inicial + "%");
			// Ejecutamos el sql
			ResultSet rs = stmt.executeQuery( );
			// Leemos el result set
			while (rs.next()) {
				Gato gato = new Gato();
				gato.setCodigo(rs.getString("CODIGO"));
				gato.setNombre(rs.getString("NOMBRE"));
				gato.setRaza(rs.getString("RAZA"));
				gato.setEdad(rs.getInt("EDAD"));
				gatos.add(gato);
			}

		} catch (SQLException e) {

		}

		return gatos;
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
