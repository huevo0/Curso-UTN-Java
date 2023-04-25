package ar.edu.utn.ap4.java.TP_Integrador.Participante;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import ar.edu.utn.ap4.java.TP_Integrador.ConexionBD.*;
import ar.edu.utn.ap4.java.TP_Integrador.Equipo.Equipo;
import ar.edu.utn.ap4.java.TP_Integrador.Partido.Partido;
import ar.edu.utn.ap4.java.TP_Integrador.Pronostico.*;


public class Participante {

	private Partido part_partido;
	private Equipo part_equipo;
	private String Nombre;
	private String Resultado;
	private ArrayList<Pronostico> participante;
	
	

	public Participante(Partido part_partido, Equipo part_equipo, String Resultado) {
		super();
		this.part_partido = part_partido;
		this.part_equipo = part_equipo;
		this.Nombre = Nombre;
		this.Resultado = Resultado;
		this.participante = new ArrayList<Pronostico>();
	}



	public Partido getPart_partido() {
		return part_partido;
	}



	public void setPart_partido(Partido part_partido) {
		this.part_partido = part_partido;
	}



	public Equipo getPart_equipo() {
		return part_equipo;
	}



	public void setPart_equipo(Equipo part_equipo) {
		this.part_equipo = part_equipo;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public ArrayList<Pronostico> getParticipante() {
		return participante;
	}



	public void setParticipante(ArrayList<Pronostico> participante) {
		this.participante = participante;
	}



	public static ArrayList<Pronostico> cargaParticipante(String Nombre, ArrayList<Equipo> equipos, ArrayList<Partido> partidos) {
		ArrayList<Pronostico> participante = new ArrayList<Pronostico>();
		ConexionBD conectar= new ConexionBD();
		Connection con = conectar.Conectar();
		String Query = "SELECT * FROM "+ Nombre;			
		
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(Query);
			

			while (rs.next()) {

				participante.add(new Pronostico(Pronostico.BPartidoid(partidos, rs.getInt(1)) , Partido.BEquipo(equipos, rs.getString(2)), rs.getNString(3) ));

			}
			

		} catch (SQLException e) {

			e.printStackTrace();
		
		}
		System.out.println("###################################### PRONOSTICO DEL PARTICIPANTE ######################################");
		System.out.println("######################################    "+   Nombre   +"    ######################################");
		System.out.println("idPartido\tEquipo\t\tResultado");
		for(Pronostico part : participante) {
			System.out.println(part.getPartido().getIdPartido()+"\t\t "+part.getEquipo().getNombre()+"\t\t"+ part.getResultado());			
			}
		return participante;
	}
//	
	
	
}