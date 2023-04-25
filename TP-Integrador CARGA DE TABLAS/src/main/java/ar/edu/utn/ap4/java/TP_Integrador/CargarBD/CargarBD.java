package ar.edu.utn.ap4.java.TP_Integrador.CargarBD;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;

import ar.edu.utn.ap4.java.TP_Integrador.ConexionBD.ConexionBD;
import ar.edu.utn.ap4.java.TP_Integrador.Equipo.Equipo;
import ar.edu.utn.ap4.java.TP_Integrador.Partido.Partido;
import ar.edu.utn.ap4.java.TP_Integrador.Pronostico.Pronostico;

public class CargarBD {

//	List<Equipo>equipos=new ArrayList<Equipo>();
//	equipos = importarEquiposCSV();
//	insertaEquiposMySQL(equipos);
//	List<Partido>partidos=new ArrayList<Partido>();
//	partidos = importarPartidosCSV();
//	insertaPartidosMySQL(partidos);
//
//	
//}
//
//public static List<Equipo> importarEquiposCSV(){
//
//List<Equipo>equipos = new ArrayList<Equipo>();
//try {
//	String archivo = "Equipo.csv" ;
//	for (String linea : Files.readAllLines(Paths.get(archivo))){
//	
//		String Codigo = linea.substring(0, 2);
//		String Nombre = linea.substring(3);
//		equipos.add(new Equipo(Codigo ,Nombre ));
//	}
//	System.out.println("LISTADO DE EQUIPOS DEL .CSV");	
//for(Equipo eq : equipos) {
//	System.out.println(eq.getCodigo()+ "\t\t" + eq.getNombre());
//}		
//} catch(IOException i){i.printStackTrace();}
//
//return equipos;
//}
//
//
//public static void insertaEquiposMySQL(List<Equipo> equipos) {
//System.out.println("SE INSERTARAN LOS DATOS EN MySQL");
//ConexionBD conectar= new ConexionBD();
//Connection con = conectar.Conectar();
//
//String Query = "INSERT INTO equipos(Codigo, Nombre) VALUES(?,?)";
//
//try {
//	PreparedStatement ps= con.prepareStatement(Query);
//	for(int i=0 ; i<equipos.size() ; i++) {
//		ps.setString(1, equipos.get(i).getCodigo());
//		ps.setString(2, equipos.get(i).getNombre());
//		ps.executeUpdate();
//		System.out.println("Se inserto el Equipo  "+ (i+1) + "/" + equipos.size());
//		}
//	ps.close();
//	con.close();
//} catch(SQLException s) {}
//}
//
//
//public static List<Partido> importarPartidosCSV(){
//
//List<Partido>partidos = new ArrayList<Partido>();
//try {
//		String archivo = "Goles.csv" ;
//		for (String linea : Files.readAllLines(Paths.get(archivo))){
//		
//			String GolesA = linea.substring(0,1);
//			String GolesB = linea.substring(2);
//			partidos.add(new Partido(GolesA, GolesB));
//		}
//
//System.out.println("LISTADO DE GOLES DEL .CSV");
//for(Partido pa : partidos) {
//	System.out.println(pa.getGolesA()+"\t\t"+pa.getGolesB());
//}		
//}catch(IOException i){i.printStackTrace();}
//
//return partidos;
//}
//
//public static void insertaPartidosMySQL(List<Partido> partidos) {
//System.out.println("SE INSERTARAN LOS DATOS EN MySQL");
//ConexionBD conectar= new ConexionBD();
//Connection con = conectar.Conectar();
//
//String Query = "UPDATE `ronda` SET `GolesA`=?,`GolesB`=? WHERE `idPartido`=?";
//
//		
//try {
//	PreparedStatement ps= con.prepareStatement(Query);
//	
//	for(int i=0 ; i<partidos.size() ; i++) {
//		System.out.println("tamaño de partido"+ partidos.size());
//		System.out.println("GolesA\t"+ partidos.get(i).getGolesA());
//		System.out.println("GolesB\t"+ partidos.get(i).getGolesB());
//		ps.setString(1, partidos.get(i).getGolesA());
//		ps.setString(2, partidos.get(i).getGolesB());
//		ps.setInt(3,i);
//		ps.executeUpdate();
//		
//		System.out.println("SE ACTUALIZARON LAS RONDAS CON RESULTADOS EN MySql \t"+ (i+1) + "/" + partidos.size());
//		}
//	ps.close();
//	con.close();
//} catch(SQLException s) {}
//}

}