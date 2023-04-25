package ar.edu.utn.ap4.java.TP_Integrador.Pronostico;

import ar.edu.utn.ap4.java.TP_Integrador.Equipo.Equipo;
import ar.edu.utn.ap4.java.TP_Integrador.Partido.Partido;
import ar.edu.utn.ap4.java.TP_Integrador.ResultadoEnum.ResultadoEnum;

public class Pronostico {
		
		private Partido partido;
		private Equipo equipo;
		private ResultadoEnum resultado;
		private int id_partido;
		public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado, int id_partido) {
			super();
			this.partido = partido;
			this.equipo = equipo;
			this.resultado = resultado;
			this.id_partido = id_partido;
		}
		public Pronostico() {
			super();
		}
		public Partido getPartido() {
			return partido;
		}
		public void setPartido(Partido partido) {
			this.partido = partido;
		}
		public Equipo getEquipo() {
			return equipo;
		}
		public void setEquipo(Equipo equipo) {
			this.equipo = equipo;
		}
		public ResultadoEnum getResultado() {
			return resultado;
		}
		public void setResultado(ResultadoEnum resultado) {
			this.resultado = resultado;
		}
		public int getId_partido() {
			return id_partido;
		}
		public void setId_partido(int id_partido) {
			this.id_partido = id_partido;
		}
		
		
		
		
}
