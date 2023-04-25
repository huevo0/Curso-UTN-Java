package ar.edu.utn.ap4.java.TP_Integrador.Partido;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ar.edu.utn.ap4.java.TP_Integrador.Equipo.Equipo;

public class Partido {
		private String idPartido;
		private String Ronda;
		private Equipo EquipoA;
		private Equipo EquipoB;
		private String GolesA;
		private String GolesB;
		public Partido(String idPartido, String ronda, Equipo equipoA, Equipo equipoB, String golesA, String golesB) {
			super();
			this.idPartido = idPartido;
			Ronda = ronda;
			EquipoA = equipoA;
			EquipoB = equipoB;
			GolesA = golesA;
			GolesB = golesB;
		}
		public Partido(String GolesA, String GolesB) {
			super();
			this.GolesA = GolesA;
			this.GolesB = GolesB;
		}
		public String getIdPartido() {
			return idPartido;
		}
		public void setIdPartido(String idPartido) {
			this.idPartido = idPartido;
		}
		public String getRonda() {
			return Ronda;
		}
		public void setRonda(String ronda) {
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
		public String getGolesA() {
			return GolesA;
		}
		public void setGolesA(String golesA) {
			GolesA = golesA;
		}
		public String getGolesB() {
			return GolesB;
		}
		public void setGolesB(String golesB) {
			GolesB = golesB;
		}
		
		
		
		
}
		

