package org.empleodigital.struts.MercaMaven.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.empleodigital.struts.MercaMaven.jpa.Producto;

public class GestorProductos {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("JavaHelps");
	
	/*static MysqlConnect c = MysqlConnect.getDbCon();

	public static ResultSet listaProductos(){

			ResultSet rs = null;
			
			try {
				rs=c.query("select * from productos");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
		}*/

	
	 public static List<Producto> listaProductos() {

	        List<Producto> productos = null;

	        // Create an EntityManager
	        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction transaction = null;

	        try {
	            // Get a transaction
	            transaction = manager.getTransaction();
	            // Begin the transaction
	            transaction.begin();

	            // Get a List of Students
	            productos = manager.createQuery("SELECT p FROM Producto p",
	                    Producto.class).getResultList();

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
	        return productos;
	 }
}