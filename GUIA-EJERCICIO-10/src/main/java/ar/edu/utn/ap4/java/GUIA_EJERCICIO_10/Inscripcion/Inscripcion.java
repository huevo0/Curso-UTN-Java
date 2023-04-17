package ar.edu.utn.ap4.java.GUIA_EJERCICIO_10.Inscripcion;

import java.util.Date;

import ar.edu.utn.ap4.java.GUIA_EJERCICIO_10.Alumno.Alumno;
import ar.edu.utn.ap4.java.GUIA_EJERCICIO_10.Materias.Materia;

public class Inscripcion {

		private Alumno alumno;
		private Materia materia;
		private Date fecha;
		public Inscripcion(Alumno alumno, Materia materia) {
			super();
			this.alumno = alumno;
			this.materia = materia;
			this.fecha = new Date();
			
		}
		
		public String aprobada() {
			String tieneMateriasAprobadas = "Aprobado";
			for(Materia matCorr : this.materia.getCorrelativas() ) {
				if(!this.alumno.getMateriasAprobadas().contains(matCorr)) {
					return tieneMateriasAprobadas = "Rechazado";
				}
				
			
			}
			return tieneMateriasAprobadas;
		}

		public Alumno getAlumno() {
			return alumno;
		}

		public void setAlumno(Alumno alumno) {
			this.alumno = alumno;
		}

		public Materia getMateria() {
			return materia;
		}

		public void setMateria(Materia materia) {
			this.materia = materia;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}
		
}
