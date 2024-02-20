package EjerciciosRepasoTema4.Ejercicio1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Smartphone {
	private String marca;
	private String modelo;
	private String imei;
	private BigDecimal precio;
	private LocalDate fechaFabricacion;
	private Boolean activo;

	public Smartphone() {
		super();
		this.activo = true;
		this.precio = BigDecimal.ZERO;
	}

	public Smartphone(String imei) {
		super();
		this.imei = imei;
		this.activo = true;
		this.precio = BigDecimal.ZERO;
	}

	public Smartphone(String marca, String modelo, String imei) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.imei = imei;
		this.activo = true;
		this.precio = BigDecimal.ZERO;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public void activar() {
		this.activo = true;
	}

	public void desactivar() {
		this.activo = false;
	}

	public Integer getEdad() {
		LocalDate fecha2000 = LocalDate.of(2000, 4, 1);
		Period periodo = fecha2000.until(fechaFabricacion);
		return periodo.getYears();
	}

	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public void establecerFechaFabricacion(LocalDate fabricacion) {
		this.fechaFabricacion = fabricacion;
	}

	public BigDecimal getPrecioMasIva() {
		return precio.multiply(new BigDecimal(1.21));
	}

	public Boolean isAltaGama(BigDecimal precioBase) {
		return (precio.compareTo(precioBase) > 0);
	}

	public Boolean isDatosCompletos() {
		return (imei != null && !imei.isBlank() && precio != null);
	}

	public Boolean isGratis() {
		return precio.equals(BigDecimal.ZERO);
	}

	public void rebajar() {
		precio = precio.subtract(BigDecimal.TEN);
	}

	@Override
	public String toString() {
		String respuesta = marca + " (" + modelo + ")";
		if (activo) {
			respuesta += " - INACTIVO";
		}
		return respuesta;
	}
}
