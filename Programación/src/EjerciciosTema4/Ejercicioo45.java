package EjerciciosTema4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicioo45 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer dia;
		Integer mes;
		Integer año;
		
		do {
			System.out.println("Dime el dia de tu nacimiento.");
			dia = sc.nextInt();
			if (dia>31 || dia<1) {
				System.out.println("El dia es incorecto.");
			}
		} while (dia>31 || dia<1);
		
		do {
			System.out.println("Dime el mes de tu nacimiento.");
			mes = sc.nextInt();
			if (mes>12 || mes<1) {
				System.out.println("El mes es incorecto.");
			}
		} while (mes>12 || mes<1);
		
		System.out.println("Dime el año de tu nacimiento.");
		año = sc.nextInt();
		LocalDate cumple = LocalDate.of(año, mes, dia);
		sc.close();
		
		System.out.println(cumple);
		
		Boolean bisiesto = cumple.isLeapYear();
		System.out.println("¿Es tu año de nacimiento un año bisiesto? " + bisiesto);

		System.out.println("Naciesta un " + cumple.getDayOfWeek());
		
		LocalDate fechaActual = LocalDate.now();
		Period años = cumple.until(fechaActual);
		System.out.println("Tienes " + años.getYears() + " años");
		
//		LocalDate fechaMuerte = LocalDate.of(año+100, mes, dia);
		LocalDate fechaMuerte = cumple.plusYears(100);
		Period tiempoVida = fechaActual.until(fechaMuerte);
		System.out.println("Suponiendo que viviras 100 años te quedan " + tiempoVida.getYears() + " años, " + 
		tiempoVida.getMonths() + " meses y " + tiempoVida.getDays() + " dias.");
		
		LocalTime horaActual = LocalTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaAcualCadena = horaActual.format(formato);
		System.out.println("La hora actual es " + horaAcualCadena);
		
	}

}
