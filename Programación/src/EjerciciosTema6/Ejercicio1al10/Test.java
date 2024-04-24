package EjerciciosTema6.Ejercicio1al10;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws SQLException, NoExisteException, ErrorException {
		Scanner sc = new Scanner(System.in);
		Personas personas = new Personas();
		personas.testConexion();
		Boolean salir = true;
		do {
			System.out.println("\tMENU \n-1.Consultar BBDD \n-2.Consultar Persona \n-3.Filtrar Personas \n-4.Insertar Persona \n-5.Salir");
			Integer num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				System.out.println(personas.consultarBBDD());
				System.out.println();
				
				break;
			case 2:
				System.out.println("Dame el DNI para consultar.");
				String consulta = sc.nextLine();
				System.out.println(personas.consultarPersonas(consulta));
				
				break;
			case 3:
				System.out.println("Dame el caracter para filtrar nombre y/o apellido de la BBDD.");
				String filtro = "";
				do {
					filtro = sc.nextLine();
					if (filtro.isBlank()) {
						System.out.println("Tienes que poner algo.");
					}
				} while (filtro.isBlank());
				System.out.println(personas.filtarPersonas(filtro));
				
				break;
			case 4:
				System.out.println(
						"Pon en este orden(DNI,NOMBRE,APELLIDO,FECHA NACIMIENTO) los datos de la persona a la que quieras meter en la BBDD");
				System.out.println();
				System.out.println();
				String dni = sc.nextLine();
				String nombre = sc.nextLine();
				String apellido = sc.nextLine();
				String fecha = "";
				LocalDate fechaNacimiento = LocalDate.of(12, 12, 12);
				Boolean co = true;
				do {
					fecha = sc.nextLine();
					co = personas.validar(fecha);
					if (!co) {
						
					} else {
						System.out.println("La fecha esta mal expresada.");
						
					}
					
					
				} while (co);
				
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				fechaNacimiento = LocalDate.parse(fecha, formatter);
				Persona persona = new Persona(dni, nombre, apellido, fechaNacimiento);
				
				personas.insertarPersona(persona);
				break;
			case 5:
				System.out.println("Adios.");
				salir = false;
				break;
				
			default:
				System.out.println("Pon uno de los numeros del menu.");
				break;
			}
			
		} while (salir);
		sc.close();
	}

}
