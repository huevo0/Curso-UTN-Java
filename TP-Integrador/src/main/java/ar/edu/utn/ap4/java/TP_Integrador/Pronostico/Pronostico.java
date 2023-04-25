package ar.edu.utn.ap4.java.TP_Integrador.Pronostico;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.management.remote.SubjectDelegationPermission;

import com.mysql.cj.QueryReturnType;

import ar.edu.utn.ap4.java.TP_Integrador.Equipo.Equipo;
import ar.edu.utn.ap4.java.TP_Integrador.Participante.Participante;
import ar.edu.utn.ap4.java.TP_Integrador.Partido.Partido;
import ar.edu.utn.ap4.java.TP_Integrador.ResultadoEnum.ResultadoEnum;
import ar.edu.utn.ap4.java.TP_Integrador.ConexionBD.ConexionBD;

public class Pronostico {
		
		private Partido idPartido;
		private Equipo equipo;
		private String resultado;
		

		
		


		public Pronostico(Partido idPartido, Equipo equipo, String resultado) {
			super();
			this.idPartido = idPartido;
			this.equipo = equipo;
			this.resultado = resultado;
			
			
		}


		

		public Partido getPartido() {
			return idPartido;
		}


		public void setPartido(Partido partido) {
			this.idPartido = partido;
		}


		public Equipo getEquipo() {
			return equipo;
		}


		public void setEquipo(Equipo equipo) {
			this.equipo = equipo;
		}


		public String getResultado() {
			return resultado;
		}


		public void setResultado(String resultado) {
			this.resultado = resultado;
		}

				
		public static Partido BPartidoid(ArrayList<Partido> bus_partido, int id_p) {

			Partido nom=null;
			for (Partido p : bus_partido) {
				if (p.getIdPartido() == id_p) {
					nom = p;
				}
				}
			return nom;
		}
		
		public static ArrayList<Pronostico> verResultados(ArrayList<Equipo> equipos, ArrayList<Partido> partidos){
			ArrayList<Pronostico>resultados = new ArrayList<Pronostico>();
			String resultado=null;
			
			for(Partido p : partidos) {
				
				//System.out.println(p.getGolesA()+ "\t" +p.getGolesB());
				
				if(p.getGolesA() == p.getGolesB()) {
													
							resultado="empata";
							resultados.add(new Pronostico(BPartidoid(partidos,p.getIdPartido()), p.getEquipoA(), resultado));
							resultados.add(new Pronostico(BPartidoid(partidos,p.getIdPartido()), p.getEquipoB(), resultado));
				
				}else if (p.getGolesA()>p.getGolesB()) {
						
					resultado="ganador";
					resultados.add(new Pronostico(BPartidoid(partidos,p.getIdPartido()), p.getEquipoA(), resultado));
					
				}else {	resultado="ganador";
						resultados.add(new Pronostico(BPartidoid(partidos,p.getIdPartido()), p.getEquipoB(), resultado));
					
			}
				
			}
			System.out.println(" ");
			System.out.println("########################### RESULTADOS DE LOS PARTIDOS PARA EL PRONOSTICO ###########################");
			System.out.println(" ");
			System.out.println("idPartido\tEquipo\t\tResultado");
			System.out.println(" ");
			for(Pronostico r : resultados) {
				System.out.println(r.idPartido.getIdPartido()+"\t\t"+r.getEquipo().getNombre()+"\t\t"+ r.resultado);
			}
			
			return resultados;
			
		}
		
		public  static int verAciertos (ArrayList<Pronostico>participante , ArrayList<Pronostico>resultados){
			
			
			int Aciertos=0;
			for (int i=0; i<22 ; i++) {
				for(int j=0;j<16;j++) {
					if(resultados.get(i).idPartido.getIdPartido() == participante.get(j).idPartido.getIdPartido()) {
						if(resultados.get(i).equipo.getNombre().equals(participante.get(j).equipo.getNombre())) {
							if(resultados.get(i).getResultado().equals(participante.get(j).resultado)) {
								Aciertos++;
							}
						}	
					}
				}
			}
					
			return Aciertos;
		}
		
		public static int verPuntos(int aciertos) {
			
		int	puntos = aciertos*10; 
				
			return puntos;
			
		}
		
}
