package EjerciciosTema4.Ejercicioo32;

import java.util.Objects;

public class Reloj {

	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formato24Horas;

	public Reloj() {
		super();
		this.horas = 00;
		this.minutos = 00;
		this.segundos = 00;
		this.formato24Horas = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		this.formato24Horas = true;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public Boolean getFormato24Horas() {
		return formato24Horas;
	}

	public void ponerEnHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}

	public void ponerEnHora(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public void setFormato24Horas(Boolean formato24Horas) {
		this.formato24Horas = formato24Horas;
	}

	public boolean checkHoras() {
		return (this.horas >= 0 && this.horas <= 23);
	}

	public boolean checkMinutos() {
		return (this.minutos >= 0 && this.minutos <= 59);
	}

	public boolean checkSegundos() {
		return (this.segundos >= 0 && this.segundos <= 59);
	}

	public boolean check() {
		if (checkHoras() && checkMinutos() && checkSegundos()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		if (check()) {
		if (formato24Horas == true) {
			return formatNumber(horas) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos);

		}
		if (formato24Horas == false) {
			if (horas >= 13) {
				return (formatNumber(horas- 12)) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos) + " pm";
			}
			return formatNumber(horas) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos) + " am";
		}
		}
		return "HORA INCORRECTA";
	}
	
	private String formatNumber(Integer x) {
		if (x>=10) {
			return x.toString();
		}
		return "0" + x;
	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}

	

}
