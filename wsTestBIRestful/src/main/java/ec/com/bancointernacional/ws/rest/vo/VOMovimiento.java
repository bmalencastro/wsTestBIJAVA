package ec.com.bancointernacional.ws.rest.vo;

import java.math.BigDecimal;

public class VOMovimiento {
	private String id;
	private String cuenta;
	private String tipo;
	private BigDecimal monto;
	private String descripcion;

	public VOMovimiento() {
		super();
	}

	public VOMovimiento(String id, String cuenta, String tipo, BigDecimal monto, String descripcion) {
		super();
		this.id = id;
		this.cuenta = cuenta;
		this.tipo = tipo;
		this.monto = monto;
		this.descripcion = descripcion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
