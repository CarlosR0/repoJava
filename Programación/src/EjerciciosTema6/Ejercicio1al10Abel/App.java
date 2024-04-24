package EjerciciosTema6.Ejercicio1al10Abel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import EjerciciosTema6.Ejercicio1al10Abel.Service.DatosIncompletosException;
import EjerciciosTema6.Ejercicio1al10Abel.Service.ErrorException;
import EjerciciosTema6.Ejercicio1al10Abel.Service.PersonaNoExisteException;
import EjerciciosTema6.Ejercicio1al10Abel.Service.PersonaService;

public class App {

	private static Scanner sc;
	private static PersonaService service;

	public static void main(String[] args) {
		try {
			sc = new Scanner(System.in);
			service = new PersonaService();

			Integer opcionElegida;
			do {
				opcionElegida = mostrarMenu();
				switch (opcionElegida) {
				case 1:
					consultarPorDni();
					break;
				case 2:
					buscarPorFiltro();
					break;
				case 3:
					insertarPersona();
					break;
				case 4:
					actualizarPersona();
					break;
				case 5:
					borrarPersona();
					break;
				case 0:
					System.out.println("Bye!!");
					break;
				default:
					System.out.println("La opción elegida no es correcta");
				}
			} while (opcionElegida != 0);

		} catch (ErrorException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

	private static void borrarPersona() throws ErrorException {
		System.out.println("Dime el DNI de la persona que quieres borrar:");
		String dni = sc.nextLine();
		try {
			service.borrarPersona(dni);
			System.out.println("Persona borrada!!");
		} catch (PersonaNoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void actualizarPersona() throws ErrorException {
		System.out.println("Indica los datos de la persona que quieres actualizar:");
		Persona persona = pedirDatosPersona();

		try {
			service.actualizarPersona(persona);
			System.out.println("Persona actualizada!!");
		} catch (PersonaNoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void insertarPersona() throws ErrorException {
		Boolean personaInsertada = false;
		do {
			System.out.println("Indica los datos de la nueva persona");
			Persona personaNew = pedirDatosPersona();
			try {
				personaNew.validar();
				service.insertarPersona(personaNew);
				personaInsertada = true;
				System.out.println("Persona insertada!!");
			} catch (DatosIncompletosException e) {
				System.out.println(e.getMessage());
			}
		} while (!personaInsertada);

	}

	private static void buscarPorFiltro() throws ErrorException {
		try {
			System.out.println("Dime un filtro para buscar personas:");
			String filtro = sc.nextLine();
			List<Persona> resultados = service.buscarPersonas(filtro);
			System.out.println("Personas encontradas:");
			for (Persona p : resultados) {
				System.out.println(p);
			}
		} catch (PersonaNoExisteException e) {
			System.out.println("No hay personas con ese filtro");
		}

	}

	private static void consultarPorDni() throws ErrorException {
		Persona persona = null;
		do {

			System.out.println("Dime qué DNI quieres consultar:");
			String dni = sc.nextLine();
			try {
				persona = service.consultarPersona(dni);
				System.out.println("Esta es la persona que buscas");
				System.out.println(persona);
			} catch (PersonaNoExisteException e) {
				System.out.println(e.getMessage());
			}
		} while (persona == null);

	}

	private static Integer mostrarMenu() {
		System.out.println("Menú:");
		System.out.println("\t1. Consultar por DNI");
		System.out.println("\t2. Consultar por filtro");
		System.out.println("\t3. Insertar nueva persona");
		System.out.println("\t4. Actualizar datos persona");
		System.out.println("\t5. Borrar persona");
		System.out.println("\t0. Salir");
		Integer opcion = sc.nextInt();
		sc.nextLine();
		return opcion;
	}

	private static Persona pedirDatosPersona() {
		Persona persona = new Persona();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Dime el DNI de la persona:");
		persona.setDni(sc.nextLine());
		System.out.println("Dime el nombre");
		persona.setNombre(sc.nextLine());
		System.out.println("Dime el apellido");
		persona.setApellidos(sc.nextLine());
		System.out.println("Dime la fecha (dd/MM/yyyy)");
		persona.setFechaNacimiento(LocalDate.parse(sc.nextLine(), format));
		return persona;
	}

}
