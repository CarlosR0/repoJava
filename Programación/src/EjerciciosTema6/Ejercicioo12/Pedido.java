package EjerciciosTema6.Ejercicioo12;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
	private Integer numero;
	private String cliente;
	private LocalDate fechaEntrega;
	private List<PedidoLinea> pedidosLinea;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String nombre) {
		this.cliente = nombre;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public List<PedidoLinea> getPedidosLinea() {
		return pedidosLinea;
	}

	public void setPedidosLinea(List<PedidoLinea> pedidosLinea) {
		this.pedidosLinea = pedidosLinea;
	}

	public String toString() {
		return "\nPEDIDO \nNumero = " + numero + "\nCliente = " + cliente + "\nFechaEntrega = " + fechaEntrega
				+ "\nPedidosLinea = " + pedidosLinea + "\n";
	}
}
