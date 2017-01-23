package org.empleodigital.struts.MercaMaven.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {
	
	@Id
	@Column(name = "id", unique = true)
	private int id;
	
	 @Column(name = "nombre", nullable = false)
	    private String nombre;

	    @Column(name = "description", nullable = false)
	    private String description;
	    
	    @Column(name = "image", nullable = false)
	    private String image;
	    
	    @Column(name = "nombre_marca", nullable = false)
	    private String nombre_marca;
	    
	    @Column(name = "peso", nullable = false)
	    private double peso;
	    
	    @Column(name = "precio", nullable = false)
	    private double precio;

		public Producto() {
		}

		public Producto(int id, String nombre, String description, String image, String nombre_marca, double peso,
				double precio) {
			this.id = id;
			this.nombre = nombre;
			this.description = description;
			this.image = image;
			this.nombre_marca = nombre_marca;
			this.peso = peso;
			this.precio = precio;
		}

		private int getId() {
			return id;
		}

		private void setId(int id) {
			this.id = id;
		}

		private String getNombre() {
			return nombre;
		}

		private void setNombre(String nombre) {
			this.nombre = nombre;
		}

		private String getDescription() {
			return description;
		}

		private void setDescription(String description) {
			this.description = description;
		}

		private String getImage() {
			return image;
		}

		private void setImage(String image) {
			this.image = image;
		}

		private String getNombre_marca() {
			return nombre_marca;
		}

		private void setNombre_marca(String nombre_marca) {
			this.nombre_marca = nombre_marca;
		}

		private double getPeso() {
			return peso;
		}

		private void setPeso(double peso) {
			this.peso = peso;
		}

		private double getPrecio() {
			return precio;
		}

		private void setPrecio(double precio) {
			this.precio = precio;
		}
	    
	
	
	
	/*@ManyToMany()
	private List<Pedido> pedidos;*/
	
	
}


