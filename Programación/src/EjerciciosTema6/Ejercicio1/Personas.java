package EjerciciosTema6.Ejercicio1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Personas {
	public Persona consultarPersonas(String dni) throws ErrorException {
		Persona persona = new Persona();
		String sql = "select * from personas where DNI = ?";
		try (Connection con = abrirConexion(); PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, dni);
			// Ejecutamos el sql
			ResultSet rs = stmt.executeQuery();
			// Leemos el result set
			while (rs.next()) {
				persona.setDni(rs.getString("DNI"));
				persona.setNombre(rs.getString("NOMBRE"));
				persona.setApellido(rs.getString("APELLIDOS"));
				Date date = rs.getDate("FECHA_NACIMIENTO");
				LocalDate fecha = date.toLocalDate();
				persona.setFechaNacimiento(fecha);
//				System.out.println("DNI: " + rs.getString("DNI"));
//				System.out.println("NOMBRE: " + rs.getString("NOMBRE"));
//				System.out.println("APELLIDOS: " + rs.getString("APELLIDOS"));

				// persona.setFechaNacimiento(rs.getDate.toLocalDate("FECHA_NACIMIENTO"));

			}

		} catch (SQLException e) {
			throw new ErrorException();
		}
		return persona;
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
