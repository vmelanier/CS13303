package db;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.sql.*;

public class JavaMySQL {
	static final Logger logger = LogManager.getLogger();
	public static void main(String[] args) {
		// 1. Carga el Driver de MySQL
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			logger.error(e1.getMessage());
			System.exit(2);			// Bonus: Implementando salidas de aplicación
		}

		// 2. Datos para conectarse a la BD
		String url = "jdbc:mysql://localhost:3306/Chinook";
		String username = "root";
		String password = "password";
		
		// 3. Query a ejecutar
		String query = "SELECT i.InvoiceId, c.FirstName,  c.LastName , i.Total "
				+ "FROM Invoice as i, Customer as c "
				+ "WHERE i.CustomerId = c.CustomerId "
				+ "AND c.FirstName like '%Luis%'"
				+ "AND c.LastName like '%Rojas%'"
				+ "ORDER by i.Total DESC; ";

		
		// 4. Try-with-resources para cerrar conexión declarada
		try (Connection conn = DriverManager.getConnection(url, username, password)){
			logger.info("Conectando a la base de datos {}", url );
			
			// 5. Declara e Inicializa Statement para ejecutar query
			Statement stmt = conn.createStatement();
			logger.info("Ejecutando query {}", query );
			
			// 6. Ejecuta Query en la base de datos
			ResultSet rs = stmt.executeQuery(query);
			
			// 7. Mueve el cursor al siguiente elemento. Cuando termina regresa false
			float total = 0;
			System.out.println("> Resultados");
			while (rs.next()){
				
				// 8. Obtiene dos Strings, un int y un Float
				float temp = rs.getFloat(4);
				total += temp;
				System.out.format("%s %s, Factura %d por %.2f\n", rs.getString(2), 
						rs.getString(3), rs.getInt(1), temp);
			}
			System.out.format("> Total de facturas %.2f\n", total);
			
			// 9. Cierra la sentencia
			stmt.close();
		} catch (SQLException e){
			logger.error(e);
		} 
		
	}
}
