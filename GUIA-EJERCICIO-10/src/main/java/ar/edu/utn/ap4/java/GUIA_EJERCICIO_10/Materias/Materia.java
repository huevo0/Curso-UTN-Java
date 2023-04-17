package ar.edu.utn.ap4.java.GUIA_EJERCICIO_10.Materias;

import java.util.List;
import java.util.ArrayList;

public class Materia {
		
		private String nombre;
		private List<Materia>Correlativas;
		public Materia(String nombre, List<Materia> correlativas) {
			super();
			this.nombre = nombre;
			Correlativas = correlativas;
		}
		public Materia(String nombre) {
			super();
			this.nombre = nombre;
			Correlativas = new ArrayList<Materia>();

		}
		public void addmateriasAprobadas(Materia materia) {
			this.Correlativas.add(materia);
			
		}
		public List<Materia> getCorrelativas() {
			return Correlativas;
		}
		public void setCorrelativas(List<Materia> correlativas) {
			Correlativas = correlativas;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		
		}
