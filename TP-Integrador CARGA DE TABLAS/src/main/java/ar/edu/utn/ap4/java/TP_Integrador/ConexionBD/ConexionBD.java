package ar.edu.utn.ap4.java.TP_Integrador.ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

		private String bd="tp-integrador";
		private String url="jdbc:mysql://localhost:3306/tp-integrador"; 
		private String user="root";
		private String password="";
		private String driver="com.mysql.cj.jdbc.Driver";
		private Connection con;
		private Statement stmt;
		
		
		public Connection Conectar() {
				
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url  , user, password);
				System.out.println("Conectado a BD: "+bd);
				
				} 
				catch (SQLException | ClassNotFoundException e) {
				System.out.println("No se pudo Conectar a BD"+bd);
				e.printStackTrace();
				}
				return con;
		}
		
		public Connection Desconectar() {
			try {
					con.close();
			} catch (SQLException e) {
					e.printStackTrace();
			}
			return con;
		}
}	
	
	