package ar.edu.utn.ap4.java.TP_Integrador.Partido;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.edu.utn.ap4.java.TP_Integrador.ConexionBD.ConexionBD;
import ar.edu.utn.ap4.java.TP_Integrador.Equipo.Equipo;

public class Partido {
		private int idPartido;
		private int Ronda;
		private Equipo EquipoA;
		private Equipo EquipoB;
		private int GolesA;
		private int GolesB;
		public Partido(int idPartido, int ronda, Equipo equipoA, Equipo equipoB, int golesA, int golesB) {
			super();
			this.idPartido = idPartido;
			this.Ronda = ronda;
			this.EquipoA = equipoA;
			this.EquipoB = equipoB;
			this.GolesA = golesA;
			this.GolesB = golesB;
		}
		
		public Partido(int idPartido, int ronda, int golesA, int golesB) {
			super();
			this.idPartido = idPartido;
			this.Ronda = ronda;
			this.GolesA = golesA;
			this.GolesB = golesB;
		}
		
		public Partido(int golesA, int golesB) {
			super();
			GolesA = golesA;
			GolesB = golesB;
		}
		
		
		public Partido() {
			super();
		}
		public int getIdPartido() {
			return idPartido;
		}
		public void setIdPartido(int idPartido) {
			this.idPartido = idPartido;
		}
		public int getRonda() {
			return Ronda;
		}
		public void setRonda(int ronda) {
			Ronda = ronda;
		}
		public Equipo getEquipoA() {
			return EquipoA;
		}
		public void setEquipoA(Equipo equipoA) {
			EquipoA = equipoA;
		}
		public Equipo getEquipoB() {
			return EquipoB;
		}
		public void setEquipoB(Equipo equipoB) {
			EquipoB = equipoB;
		}
		public int getGolesA() {
			return GolesA;
		}
		public void setGolesA(int golesA) {
			GolesA = golesA;
		}
		public int getGolesB() {
			return GolesB;
		}
		public void setGolesB(int golesB) {
			GolesB = golesB;
		}
		
		public static List<Partido> importarPartidosCSV(){
			
			List<Partido>partidos = new ArrayList<Partido>();
			try {
					String archivo = "Goles.csv" ;
					for (String linea : Files.readAllLines(Paths.get(archivo))){
					
						int GolesA = Integer.parseInt(linea.substring(0,1));
						int GolesB = Integer.parseInt(linea.substring(2));
						partidos.add(new Partido(GolesA, GolesB));
					}
			
			System.out.println("############################ LISTADO DE GOLES DEL ARCHIVO .CSV ############################");
			for(Partido pa : partidos) {
				System.out.println(pa.getGolesA()+"\t\t"+pa.getGolesB());
			}		
			}catch(IOException i){i.printStackTrace();}
			
			return partidos;
		}
		
		
		
		public static void insertaPartidosMySQL(List<Partido> partidos) {
			System.out.println("############################ SE INSERTARAN LOS GOLES DE CADA PARTIDO EN MySQL ############################");
			ConexionBD conectar= new ConexionBD();
			Connection con = conectar.Conectar();
			
			String Query = "UPDATE `ronda` SET `GolesA`=?,`GolesB`=? WHERE `idPartido`=?";
		
					
			try {
				PreparedStatement ps= con.prepareStatement(Query);
				
				for(int i=0 ; i<partidos.size() ; i++) {
					System.out.println("tamaño de partido"+ partidos.size());
					System.out.println("GolesA\t"+ partidos.get(i).getGolesA());
					System.out.println("GolesB\t"+ partidos.get(i).getGolesB());
					ps.setInt(1, partidos.get(i).getGolesA());
					ps.setInt(2, partidos.get(i).getGolesB());
					ps.setInt(3,i);
					ps.executeUpdate();
					
					System.out.println("SE ACTUALIZARON LAS RONDAS CON RESULTADOS EN MySql \t"+ (i+1) + "/" + partidos.size());
					}
				ps.close();
				con.close();
			} catch(SQLException s) {}
		}
		
		
		public static ArrayList<Partido> consultarPartidosbd(ArrayList<Equipo> equipos){
			ArrayList<Partido>partidos=new ArrayList<Partido>();
			System.out.println("###########################");
			System.out.println("CONSULTAR PARTIDOS DE LA BD");
			System.out.println("###########################");
			ConexionBD conectar= new ConexionBD();
			Connection con = conectar.Conectar();
			String Query = "SELECT * FROM Ronda";			
			
			try {
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(Query);
				int i=0;
				while(rs.next()) {
					
					partidos.add(new Partido(rs.getInt(1),rs.getInt(2),BEquipo(equipos , rs.getString(3)),
											BEquipo(equipos , rs.getString(4)),rs.getInt(5),rs.getInt(6)));
					
					
					
					System.out.println("Se Cargo el Partido  "+ (i+1) + "/16");
					i++;
				}
				
				} catch(SQLException s) {}
			System.out.println("########################### RONDAS CARGADAS DESDE LA BASE DE DATOS ###########################");
			System.out.println("idPartido\tRonda\tEquipo A\tEquipo B\tGoles A\t GolesB");
				for(Partido pa : partidos) {
					System.out.println(pa.idPartido +"\t\t"+ pa.Ronda +"\t"+ pa.EquipoA.getNombre() +"\t\t"+ pa.EquipoB.getNombre() +"\t\t"+ pa.GolesA +"\t"+ pa.GolesB);
				}
			return partidos;
		}
		public static Equipo BEquipo(ArrayList<Equipo> bus_equipo, String nom_eq) {

			Equipo nom=null;
			for (Equipo e : bus_equipo) {
				if (e.getNombre().equals(nom_eq)) {
					nom = e;
					
				}
			}
			return nom;
		}
		
}
		

