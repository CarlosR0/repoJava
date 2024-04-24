package EjerciciosTema6.Ejercicio1al10Abel.Service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import EjerciciosTema6.Ejercicio1al10Abel.Persona;

public class PersonaService {

	public Persona consultarPersona(String dni) throws PersonaNoExisteException, ErrorException {

		String sql = "SELECT * FROM PERSONAS WHERE DNI = ?";

		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, dni);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// existe la persona con ese DNI
				Persona persona = new Persona();
				persona.setNombre(rs.getString("nombre"));
				persona.setApellidos(rs.getString("apellidos"));
				persona.setDni(rs.getString("dni"));
				persona.setFechaNacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
				return persona;
			} else {
				// no existe la persona con ese DNI
				throw new PersonaNoExisteException("No existe persona con dni " + dni);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new ErrorException("No he podido conectar con la BBDD");
		}

	}

	public List<Persona> buscarPersonas(String filtro) throws PersonaNoExisteException, ErrorException {
		List<Persona> personas = new ArrayList<Persona>();
		String sql = "select * from personas where nombre like ? or apellidos like ?";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, "%" + filtro + "%");
			stmt.setString(2, "%" + filtro + "%");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Persona persona = new Persona();
				persona.setNombre(rs.getString("nombre"));
				persona.setApellidos(rs.getString("apellidos"));
				persona.setDni(rs.getString("dni"));
				persona.setFechaNacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
				personas.add(persona);
			}
			if (personas.isEmpty()) {
				throw new PersonaNoExisteException("No hay personas con este filtro");
			}
			return personas;

		} catch (SQLException e) {
			e.printStackTrace();
			throw new ErrorException("No he podido conectarme a la BBDD");
		}

	}

	public void insertarPersona(Persona persona) throws ErrorException {
		try (Connection conn = abrirConexion()) {
			insertarPersona(conn, persona);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ErrorException("No he podido conectarme a la BBDD");
		}
	}

	public void insertarPersonas(List<Persona> personas) throws ErrorException {
		try (Connection conn = abrirConexion()) {
			conn.setAutoCommit(false);
			try {
				for (Persona persona : personas) {
					insertarPersona(conn, persona);
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

	public void insertarPersona(Connection conn, Persona persona) throws SQLException {
		String sql = "INSERT INTO PERSONAS VALUES (?,?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, persona.getDni());
		stmt.setString(2, persona.getNombre());
		stmt.setString(3, persona.getApellidos());
		stmt.setDate(4, Date.valueOf(persona.getFechaNacimiento()));
		stmt.execute();
	}

	public Integer borrarPersonasA() {
		// 1. Consultar todas las personas usando buscarPersonas()
		// 2. Bucle foreach y condicional si es mayor de edad
		// 3. Si es mayor de edad--> borrar usando borrarPersona()
		// Controlar transacción única y llamar al borrarPersona() pero en un método
		// privado común
		// Contador para ver cuántas se van borrando --> return
		return null;
	}

	public Integer borrarPersonasB() {
		// Ejecutar un DELETE FROM PERSONAS WHERE FECHA_NACIMIENTO <= ?
		// Calcular fecha de nacimiento de todos los mayores de edad (ahora - 18 años)
		return null;
	}

	public void actualizarPersona(Persona persona) throws ErrorException, PersonaNoExisteException {
		String sql = "UPDATE PERSONAS SET NOMBRE = ?, APELLIDOS = ?, FECHA_NACIMIENTO = ? WHERE DNI = ?";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, persona.getNombre());
			stmt.setString(2, persona.getApellidos());
			stmt.setDate(3, Date.valueOf(persona.getFechaNacimiento()));
			stmt.setString(4, persona.getDni());
			Integer cantActualizada = stmt.executeUpdate();
			if (cantActualizada == 0) {
				throw new PersonaNoExisteException("No existe persona con el dni indicado. NO se ha actualizado nada.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ErrorException("No he podido conectarme a la BBDD");
		}
	}

	public void borrarPersona(String dni) throws ErrorException, PersonaNoExisteException {
		String sql = "DELETE FROM PERSONAS WHERE DNI = ?";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, dni);
			Integer cantBorrada = stmt.executeUpdate();
			if (cantBorrada == 0) {
				throw new PersonaNoExisteException(
						"No existe ninguna persona con el dni indicado, no se ha borrado nada");
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
