package org.empleodigital.struts.MercaMaven.actions;

import java.util.List;

import org.empleodigital.struts.MercaMaven.db.GestorProductos;
import org.empleodigital.struts.MercaMaven.jpa.Producto;

import com.opensymphony.xwork2.ActionSupport;

public class ProductosAction extends ActionSupport {

	List<Producto> listaProductos;
	public String productos;

	public String execute() {
		if (productos != null) {
			listaProductos = GestorProductos.listaProductos();
			return SUCCESS;
		}
		else{
			return ERROR;
		}
		
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}
}
