package ar.edu.utn.ap4.java.TP_Integrador.ConexionBD;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


import ar.edu.utn.ap4.java.TP_Integrador.Partido.Partido;

public class ConexionBD {

		private String bd;
		private String url; 
		private String user;
		private String password;
		private String driver;
		private Connection con;
		
		public Connection Conectar() {
		
		Properties configuracion = new Properties();
		InputStream entrada = null;
		
		try {	
				
				entrada = new FileInputStream("Configuracion.csv");
				configuracion.load(entrada);	
				bd = configuracion.getProperty("bd");
				url = configuracion.getProperty("url");
				user = configuracion.getProperty("user");
				password = configuracion.getProperty("password");
				driver=configuracion.getProperty("driver");
				
		}catch(IOException i){i.printStackTrace();}
			
					
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
	
	