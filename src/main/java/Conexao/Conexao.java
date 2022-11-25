package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

		public Connection getConnection() throws ClassNotFoundException, SQLException 
		{
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
			
				return DriverManager.getConnection("jdbc:mysql://localhost/agencia_viagem","root", "");
				
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

