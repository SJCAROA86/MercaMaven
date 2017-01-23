package org.empleodigital.struts.MercaMaven.actions;

import org.empleodigital.struts.MercaMaven.db.GestorUsuarios;

import com.opensymphony.xwork2.ActionSupport;

public class RegistroAction extends ActionSupport {

	private String usuario;
	private String pass;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int telefono;
	private String direccion;
	private String email;
	private String registro;
	

	public String execute() {

		if (registro != null) {
			GestorUsuarios.nuevoUsuario(usuario, pass, nombre, apellido1, apellido2, telefono, direccion, email);
			return SUCCESS;
		} else {
			return ERROR;
		}

	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
