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
		
		
		
}
