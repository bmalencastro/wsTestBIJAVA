package ec.com.bancointernacional.ws.rest.model;

import java.math.BigDecimal;

import ec.com.bancointernacional.ws.rest.vo.VOUsuario;

public class TransactionResponse {
	private VOUsuario usuario;
	private BigDecimal saldoActual;
	private Integer mensajeCodigo;
	private String mensaje;

	public TransactionResponse() {
		super();
	}

	public TransactionResponse(Integer mensajeCodigo, String mensaje) {
		super();
		this.mensajeCodigo = mensajeCodigo;
		this.mensaje = mensaje;
	}

	public TransactionResponse(VOUsuario usuario, BigDecimal saldoActual, Integer mensajeCodigo, String mensaje) {
		super();
		this.usuario = usuario;
		this.saldoActual = saldoActual;
		this.mensajeCodigo = mensajeCodigo;
		this.mensaje = mensaje;
	}

	public VOUsuario getUsuario() {
		return usuario;
	}

	public void setUsuario(VOUsuario usuario) {
		this.usuario = usuario;
	}

	public Integer getMensajeCodigo() {
		return mensajeCodigo;
	}

	public void setMensajeCodigo(Integer mensajeCodigo) {
		this.mensajeCodigo = mensajeCodigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public BigDecimal getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(BigDecimal saldoActual) {
		this.saldoActual = saldoActual;
	}
}
