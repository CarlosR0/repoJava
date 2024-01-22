package EjerciciosTema4.Ejercicioo33;

public class TestSemaforo {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();
		System.out.println(semaforo);
		
		semaforo.setColor("MORADO");
		System.out.println(semaforo);
		
		semaforo.setColor(Semaforo.VERDE);
		System.out.println(semaforo);
		
		semaforo.setParpadeando(true);
		System.out.println(semaforo);

		semaforo.setColor(Semaforo.AMBAR);
		System.out.println(semaforo);
		
		semaforo.setParpadeando(true);
		System.out.println(semaforo);
		
		for (int i = 0; i < 5; i++) {
			semaforo.cambiarEstado();
		}
		System.out.println(semaforo);
		
		Semaforo semaforo2 = semaforo;
		System.out.println(semaforo2);
		
	}

}
