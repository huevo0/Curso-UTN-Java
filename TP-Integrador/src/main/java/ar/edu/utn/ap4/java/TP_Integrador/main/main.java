package ar.edu.utn.ap4.java.TP_Integrador.main;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.*;
import ar.edu.utn.ap4.java.TP_Integrador.ConexionBD.*;
import ar.edu.utn.ap4.java.TP_Integrador.Equipo.Equipo;
import ar.edu.utn.ap4.java.TP_Integrador.Participante.Participante;
import ar.edu.utn.ap4.java.TP_Integrador.Partido.Partido;
import ar.edu.utn.ap4.java.TP_Integrador.Pronostico.Pronostico;
import ar.edu.utn.ap4.java.TP_Integrador.ResultadoEnum.ResultadoEnum;
public class main {

	public static void main(String[] args) {

		List<Equipo>equiposCSV=new ArrayList<Equipo>();
		equiposCSV = Equipo.importarEquiposCSV();
		Equipo.insertaEquiposMySQL(equiposCSV);
		List<Partido>partidosCSV=new ArrayList<Partido>();
		partidosCSV = Partido.importarPartidosCSV();
		Partido.insertaPartidosMySQL(partidosCSV);
		
		
		
		ArrayList<Equipo>equiposSQL = Equipo.consultarEquiposbd();
		ArrayList<Partido>partidosSQL = Partido.consultarPartidosbd( equiposSQL);
		ArrayList<Pronostico>resultados = Pronostico.verResultados(equiposSQL , partidosSQL);
		ArrayList<Pronostico>participante1 = Participante.cargaParticipante("Mariana",equiposSQL ,partidosSQL); 
		ArrayList<Pronostico>participante2 = Participante.cargaParticipante("Pedro", equiposSQL ,partidosSQL);
		int aciertosMariana = Pronostico.verAciertos(participante1 , resultados);
		int aciertosPedro = Pronostico.verAciertos(participante2 , resultados);
		
		
		System.out.println("\n########################## PRONOSTICOS ACERTADOS ##########################");
		System.out.println("Mariana tiene: "+aciertosMariana+" Aciertos");
		System.out.println("Pedro tiene: "+aciertosPedro + " Aciertos"); 

		System.out.println("\n########################## PUNTOS DE PARTICIPANTES ##########################");		 
		System.out.println("Mariana tiene: "+Pronostico.verPuntos(aciertosMariana)+" Puntos");
		System.out.println("Pedro tiene: "+Pronostico.verPuntos(aciertosPedro) + " Puntos"); 
		
		
}

	
}