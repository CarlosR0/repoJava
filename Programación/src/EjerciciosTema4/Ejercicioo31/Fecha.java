package EjerciciosTema4.Ejercicioo31;

public interface Fecha {

	public void cambiar(Integer dia,Integer mes,Integer año);
	public void cambiarActual();
	public String toString();
	public Boolean validar();
	public void cambiarFormato(String formato);
	public boolean equals(Object obj);
	public Integer getDia();
	public Integer getMes();
	public Integer getAño();
	public String getDiaSemana();
	public void sumarDia(Integer dia);
	public void sumarMes(Integer mes);
	public void sumarAño(Integer año);
	public Boolean isFestivo();
	public Fecha restar(Fecha fecha);
	public Integer getDiasRestanteAño();
	public Boolean isBisiesto();
	
	
	
}
