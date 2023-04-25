package ar.edu.utn.ap4.java.TP_Integrador.Ronda;

import java.util.ArrayList;
import java.util.List;

import ar.edu.utn.ap4.java.TP_Integrador.Partido.Partido;

public class Ronda {

	private String nro;
	private List <Partido> partidos;
	public Ronda(String nro, List<Partido> partidos) {
		super();
		this.nro = nro;
		this.partidos = partidos;
	}
	
	public Ronda(ArrayList<Partido> partidos) {
		super();
		this.nro = nro;
		partidos = new ArrayList<Partido>();
		
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
	
}
