package org.empleodigital.struts.MercaMaven.db;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.empleodigital.struts.MercaMaven.jpa.Cliente;

public class GestorUsuarios {

	// static MysqlConnect c = MysqlConnect.getDbCon();

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("JavaHelps");

	// -----------------------------------------OTRA MANERA DE
	// HACERLO------------------------------------------------------
	/*
	 * public static boolean existeUsuario(String user, String pass) {
	 * 
	 * ResultSet rs = null;
	 * 
	 * try { rs =
	 * c.query("select id,usuario,password from cliente where usuario='" + user
	 * + "' and password ='" + pass + "'"); if (rs.next()) { return true; } }
	 * catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return false; }
	 * 
	 * public static boolean crearUsuario(String user, String pass, String
	 * nombre, String apellido1, String apellido2, String telefono, String
	 * direccion, String email) {
	 * 
	 * MysqlConnect c = MysqlConnect.getDbCon();
	 * 
	 * try { int resultado = c.
	 * insert("INSERT INTO cliente (usuario,password,nombre,apellido1,apellido2,telefono,direccion,email) VALUES "
	 * + "('" + user + "','" + pass + "','" + nombre + "','" + apellido1 + "','"
	 * + apellido2 + "'," + telefono + ",'" + direccion + "','" + email + "')");
	 * 
	 * 
	 * if (resultado == 1) { return true; }
	 * 
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return false; }
	 */
	// ------------------------------NUEVA MANERA DE
	// HACERLO------------------------------------------------------------
	public static Cliente existeUsuario(String user, String pass) {
		// Create an EntityManager
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		Cliente cliente = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			// Begin the transaction
			transaction.begin();

			// Get a List of Cliente
			Query consulta = manager.createQuery("SELECT c FROM Cliente c where usuario=:usu and password=:pwd ",
					Cliente.class);
			consulta.setParameter("usu", user);
			consulta.setParameter("pwd", pass);
			cliente = (Cliente) consulta.getSingleResult();

			// Commit the transaction
			transaction.commit();
		} catch (Exception ex) {
			// If there are any exceptions, roll back the changes
			if (transaction != null) {
				transaction.rollback();
			}
			// Print the Exception
			ex.printStackTrace();
		} finally {
			// Close the EntityManager
			manager.close();
		}
		return cliente;
	}

	public static void nuevoUsuario(String usuario, String pass, String nombre, String apellido1, String apellido2,
			int telefono, String direccion, String email) {
		// Create an EntityManager
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			// Begin the transaction
			transaction.begin();

			// Create a new Student object
			Cliente cli = new Cliente();

			cli.setNombre(nombre);
			cli.setApellido1(apellido1);
			cli.setApellido2(apellido2);
			cli.setDireccion(direccion);
			cli.setTelefono(telefono);
			cli.setEmail(email);
			cli.setUsuario(usuario);
			cli.setPassword(pass);

			// Save the student object
			manager.persist(cli);

			// Commit the transaction
			transaction.commit();
		} catch (Exception ex) {
			// If there are any exceptions, roll back the changes
			if (transaction != null) {
				transaction.rollback();
			}
			// Print the Exception
			ex.printStackTrace();
		} finally {
			// Close the EntityManager
			manager.close();
		}
	}
}
