package EjerciciosTema4.Ejercicioo32;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
	Reloj reloj = new Reloj();
	Scanner sc = new Scanner(System.in);
	System.out.println(reloj);
	System.out.println("Dime la hora.");
	System.out.println("Dime los minutos.");
	System.out.println("Dime los segundos.");
	Integer h = sc.nextInt();
	Integer min = sc.nextInt();	
	Integer sec = sc.nextInt();
	sc.close();
	
	reloj.ponerEnHora(h, min, sec);
	System.out.println(reloj);
	
	reloj.setFormato24Horas(false);
	System.out.println(reloj);
	
	reloj.ponerEnHora(24, 17);
	System.out.println(reloj);
	
	reloj.ponerEnHora(21, 82);
	System.out.println(reloj);
	
	reloj.ponerEnHora(17, 16, 15);
	System.out.println(reloj);
	
	Reloj reloj2 = new Reloj(17, 16, 15);
	System.out.println(reloj2);

	System.out.println("Los relojes son iguales -> " + reloj.equals(reloj2));
	
	}
}
