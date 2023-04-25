package ar.edu.utn.ap4.java.TP_Integrador.ResultadoEnum;

import java.util.ArrayList;

import javax.management.remote.SubjectDelegationPermission;

import ar.edu.utn.ap4.java.TP_Integrador.Equipo.Equipo;
import ar.edu.utn.ap4.java.TP_Integrador.Pronostico.Pronostico;
import ar.edu.utn.ap4.java.TP_Integrador.Partido.Partido;

public class ResultadoEnum {

		/*ganador, perdedor, empate*/
	 int id;
	 Equipo equipo;
	 String resultadoPartido=null;
	 ResultadoEnum resultado;
	
	
	
	
	
	public ResultadoEnum(int id, Equipo equipo, String resultadoPartido) {
		super();
		this.id = id;
		this.equipo = equipo;
		this.resultadoPartido = resultadoPartido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public String getResultadoPartido() {
		return resultadoPartido;
	}





	public void setResultadoPartido(String resultadoPartido) {
		this.resultadoPartido = resultadoPartido;
	}	





	
	
	
	
}
