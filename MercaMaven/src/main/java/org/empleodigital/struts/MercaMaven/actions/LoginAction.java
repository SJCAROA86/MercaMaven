package org.empleodigital.struts.MercaMaven.actions;

import java.util.Map;

import org.empleodigital.struts.MercaMaven.db.GestorUsuarios;
import org.empleodigital.struts.MercaMaven.jpa.Cliente;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String usuario;
	private String pass;
	public String logeo;

	public String execute() {

		Map<String, Object> session = ActionContext.getContext().getSession();

		if (logeo != null) {
			Cliente cli = GestorUsuarios.existeUsuario(usuario, pass);
			if (cli != null) {
				session.put("usuario", cli.getUsuario());
				return SUCCESS;
			}
		}
		return ERROR;

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

	public String getLogeo() {
		return logeo;
	}

	public void setLogeo(String logeo) {
		this.logeo = logeo;
	}

}
