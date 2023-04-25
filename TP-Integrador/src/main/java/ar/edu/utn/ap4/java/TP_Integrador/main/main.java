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

		ArrayList<Equipo>equipos = Equipo.consultarEquiposbd();
		ArrayList<Partido>partidos = Partido.consultarPartidosbd( equipos);
		ArrayList<Pronostico>resultados = Pronostico.verResultados(equipos , partidos);
		ArrayList<Pronostico>participante1 = Participante.cargaParticipante("Mariana",equipos ,partidos); 
		ArrayList<Pronostico>participante2 = Participante.cargaParticipante("Pedro", equipos ,partidos);
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