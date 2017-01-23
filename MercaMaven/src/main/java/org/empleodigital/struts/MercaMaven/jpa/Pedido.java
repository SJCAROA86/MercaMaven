package org.empleodigital.struts.MercaMaven.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

	@Id
	@Column(name = "id", unique = true)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@Column(name = "confirmado", nullable = false)
	private boolean confirmado;
	
	/*@ManyToMany(mappedBy="productos")
	private List<Producto> productos;*/
	
}
