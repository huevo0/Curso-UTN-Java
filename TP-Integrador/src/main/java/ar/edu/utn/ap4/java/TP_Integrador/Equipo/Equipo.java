package ar.edu.utn.ap4.java.TP_Integrador.Equipo;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import ar.edu.utn.ap4.java.TP_Integrador.ConexionBD.ConexionBD;

public class Equipo {
		private String codigo;
		private String nombre;
		
		
		public Equipo(String codigo , String nombre) {
			super();
			
			this.codigo = codigo;
			this.nombre = nombre;
		}
		
		public Equipo() {
			
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		
		public static ArrayList<Equipo> consultarEquiposbd(){
			ArrayList<Equipo>equipos=new ArrayList<Equipo>();
			System.out.println("CONSULTAR EQUIPOS DE LA BD");
			ConexionBD conectar= new ConexionBD();
			Connection con = conectar.Conectar();
			String Query = "SELECT * FROM Equipos";			
			System.out.println("###################################### EQUIPOS CARGADOS DESDE MySQL ######################################");
			
			try {
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(Query);
				int i=0;
				while(rs.next()) {
					
					equipos.add(new Equipo(rs.getString("Codigo"),rs.getString("Nombre") ));
					
					System.out.println("Se Cargo el Equipo  "+ (i+1) + "/16");
					i++;
					}
				} catch(SQLException s) {}
			System.out.println("###################");
			System.out.println("Codigo\tEquipo");
			System.out.println("###################");
				for(Equipo eq : equipos) {
					System.out.println(eq.codigo +"\t"+ eq.nombre);
				}
			return equipos;
		}
			
		}
		

