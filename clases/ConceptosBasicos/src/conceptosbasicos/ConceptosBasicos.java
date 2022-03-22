package conceptosbasicos;

import Ico.fes.Alumno;
import Ico.fes.Automovil;
import Ico.fes.Persona;
import Ico.fes.Silla;
import java.awt.Color;

public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo");
        Silla s1 = new Silla();
        System.out.println(s1); //Por defecto se invoca toString()
        System.out.println(s1.toString());
    
  
        Automovil miVocho = new Automovil();
        System.out.println(miVocho);
        miVocho.setMarca(" VW");
        miVocho.setSubMarca(" Sedan");
        miVocho.setModelo( 1970);
        miVocho.setColor( Color.BLUE);
        System.out.println(miVocho);
    
        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.yellow);
        System.out.println(miMustang);
        
        Automovil miAkura= new Automovil("Akura", "NSX", 2013, Color.GRAY);
        System.out.println(miAkura);
        
        Persona per1= new Persona();
       // per1.edad=20; no se permite por seguridad//
       per1.setEdad(22);
        System.out.println(per1);
        Alumno al = new Alumno();
        al.setNombre("José");
        al.setNumeroCuenta("31928396-1");
        al.setGrupo(2209);
        System.out.println(al);
    }
  
}
