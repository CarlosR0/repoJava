package EjerciciosTema6.Ejercicioo12;

import java.math.BigDecimal;

public class PedidoLinea {
	private Integer numeroPedido;
	private String articulo;
	private Integer cantidad;
	private BigDecimal precioUnitario;

	public PedidoLinea() {
		super();
	}

	public PedidoLinea(Integer numeroPedido, String articulo, Integer cantidad, BigDecimal precioUnitario) {
		super();
		this.numeroPedido = numeroPedido;
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}

	public Integer getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "\nPEDIDO_LINEA \nnumeroPedido = " + numeroPedido + "\narticulo = " + articulo + "\ncantidad = " + cantidad
				+ "\nprecioUnitario = \t" + precioUnitario + "\n";
	}

}
