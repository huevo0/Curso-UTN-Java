package ar.edu.utn.ap4.java.GUIA_EJERCICIO_10;


import java.util.ArrayList;
import java.util.List;

import ar.edu.utn.ap4.java.GUIA_EJERCICIO_10.Alumno.Alumno;
import ar.edu.utn.ap4.java.GUIA_EJERCICIO_10.Inscripcion.Inscripcion;
import ar.edu.utn.ap4.java.GUIA_EJERCICIO_10.Materias.Materia;

public class App 
{
    public static void main( String[] args )
    {
        Materia m1 = new Materia("Programacion I");
        Materia m2 = new Materia("Base de datos I ");
        
        List c1 = new ArrayList<Materia>();
        c1.add(m1);
        Materia m3 = new Materia("Programacion II", c1);
        
        List c2 = new ArrayList<Materia>();
        c2.add(m2);
        Materia m4 = new Materia("Base de datos II" , c2);
        
        List c3 = new ArrayList<Materia>();
        c3.add(m1);
        c3.add(m3);
        Materia m5 = new Materia("Programacion III", c3);
        
        List c4 = new ArrayList<Materia>();
        c4.add(m2);
        c4.add(m4);
        Materia m6 = new Materia("Base de datos III", c4);
        
        Alumno a1 = new Alumno("José Rodriguez" , "L2324");
        Alumno a2 = new Alumno("Vanesa Sosa" , "L2325");
        Alumno a3 = new Alumno("Lucia Perez" , "L2326");
        Alumno a4 = new Alumno("Vanesa Rojas" , "L2327");
    
        a1.addmateriasAprobadas(m1);
        a1.addmateriasAprobadas(m2);
                
        a2.addmateriasAprobadas(m1);
        a2.addmateriasAprobadas(m3);
        
        a3.addmateriasAprobadas(m2);
        a3.addmateriasAprobadas(m4);
        
        a4.addmateriasAprobadas(m3);
        a4.addmateriasAprobadas(m4);

        Inscripcion ic1= new Inscripcion(a1,m5);
        Inscripcion ic2= new Inscripcion(a1,m6);
        Inscripcion ic3= new Inscripcion(a2,m5);
        Inscripcion ic4= new Inscripcion(a2,m6);
        Inscripcion ic5= new Inscripcion(a3,m5);
        Inscripcion ic6= new Inscripcion(a3,m6);
        Inscripcion ic7= new Inscripcion(a4,m5);
        Inscripcion ic8= new Inscripcion(a4,m6);
        
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tPLANILLA DE INSCRIPCION");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("ALUMNO\t\t\tMATERIA\t\t\tESTADO");
        System.out.println(ic1.getAlumno().getAlumno() +"\t\t"+ ic1.getMateria().getNombre()+"\t"+ ic1.getFecha() );
        System.out.println(ic2.getAlumno().getAlumno() +"\t\t"+ ic2.getMateria().getNombre()+"\t"+ ic2.getFecha() );
        System.out.println(ic3.getAlumno().getAlumno() +"\t\t"+ ic3.getMateria().getNombre()+"\t"+ ic3.getFecha() );
        System.out.println(ic4.getAlumno().getAlumno() +"\t\t"+ ic4.getMateria().getNombre()+"\t"+ ic4.getFecha() );
        System.out.println(ic5.getAlumno().getAlumno() +"\t\t"+ ic5.getMateria().getNombre()+"\t"+ ic5.getFecha() );
        System.out.println(ic6.getAlumno().getAlumno() +"\t\t"+ ic6.getMateria().getNombre()+"\t"+ ic6.getFecha() );
        System.out.println(ic7.getAlumno().getAlumno() +"\t\t"+ ic7.getMateria().getNombre()+"\t"+ ic7.getFecha() );
        System.out.println(ic8.getAlumno().getAlumno() +"\t\t"+ ic8.getMateria().getNombre()+"\t"+ ic8.getFecha() );
        
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("\t\t\tPLANILLA DE RESULTADO");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("ALUMNO\t\t\tMATERIA\t\t\tFECHA");
        System.out.println(ic1.getAlumno().getAlumno() +"\t\t"+ ic1.getMateria().getNombre() +"\t"+ ic1.aprobada());
        System.out.println(ic2.getAlumno().getAlumno() +"\t\t"+ ic2.getMateria().getNombre() +"\t"+ ic2.aprobada());
        System.out.println(ic3.getAlumno().getAlumno() +"\t\t"+ ic3.getMateria().getNombre() +"\t"+ ic3.aprobada());
        System.out.println(ic4.getAlumno().getAlumno() +"\t\t"+ ic4.getMateria().getNombre() +"\t"+ ic4.aprobada());
        System.out.println(ic5.getAlumno().getAlumno() +"\t\t"+ ic5.getMateria().getNombre() +"\t"+ ic5.aprobada());
        System.out.println(ic6.getAlumno().getAlumno() +"\t\t"+ ic6.getMateria().getNombre() +"\t"+ ic6.aprobada());
        System.out.println(ic7.getAlumno().getAlumno() +"\t\t"+ ic7.getMateria().getNombre() +"\t"+ ic7.aprobada());
        System.out.println(ic8.getAlumno().getAlumno() +"\t\t"+ ic8.getMateria().getNombre() +"\t"+ ic8.aprobada());

	}
}
