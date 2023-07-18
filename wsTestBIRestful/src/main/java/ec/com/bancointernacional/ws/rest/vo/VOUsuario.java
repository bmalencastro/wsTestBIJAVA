package ec.com.bancointernacional.ws.rest.vo;

import java.util.List;

public class VOUsuario {
	private String id;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String cuenta;
	private List<VOMovimiento> lstMovimiento;
	private String cargo;
	private String fechaCreacion;
	private String tipo;

	public VOUsuario() {
		super();
	}

	public VOUsuario(String id, String nombre, String apellido, Integer edad, String cuenta,
			List<VOMovimiento> lstMovimiento, String cargo, String fechaCreacion, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cuenta = cuenta;
		this.lstMovimiento = lstMovimiento;
		this.cargo = cargo;
		this.fechaCreacion = fechaCreacion;
		this.tipo = tipo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public List<VOMovimiento> getLstMovimiento() {
		return lstMovimiento;
	}

	public void setLstMovimiento(List<VOMovimiento> lstMovimiento) {
		this.lstMovimiento = lstMovimiento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
