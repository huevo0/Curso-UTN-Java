package ar.edu.utn.ap4.java.GUIA_EJERCICIO_10.Alumno;

import java.util.List;
import java.util.ArrayList;


import ar.edu.utn.ap4.java.GUIA_EJERCICIO_10.Materias.Materia;

public class Alumno {
		
		private String alumno;
		private String legajo;
		private List<Materia> materiasAprobadas;
		public Alumno(String alumno, String legajo) {
			super();
			this.alumno = alumno;
			this.legajo = legajo;
			this.materiasAprobadas = new ArrayList<Materia>();
		}
		
		public void addmateriasAprobadas(Materia materia) {
			this.materiasAprobadas.add(materia);
			
		}

		public List<Materia> getMateriasAprobadas() {
			return materiasAprobadas;
		}

		public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
			this.materiasAprobadas = materiasAprobadas;
		}

		public String getAlumno() {
			return alumno;
		}

		public void setAlumno(String alumno) {
			this.alumno = alumno;
		}
		
		
 }
