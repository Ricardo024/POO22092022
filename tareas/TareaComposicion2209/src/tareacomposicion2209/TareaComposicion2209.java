package tareacomposicion2209;

import ElAlquimista.Libro;
import SoyLeyenda.Pelicula;
import libro.componentes.Autor;
import libro.componentes.Editorial;
import pelicula.clases.Actor;
import pelicula.clases.Director;
import pelicula.clases.Productora;
        
public class TareaComposicion2209 {

    public static void main(String[] args) {
        Pelicula miPeli = new Pelicula();
        miPeli.setNombre("Soy Leyenda");
        miPeli.setDuracion(140);
        miPeli.setEstelar(new Actor("Will Smith", 38));
        miPeli.setDirector(new Director("Francis Lawrence", "Australiano"));
        miPeli.setProductora(new Productora("Warner Bros", "Warner Bros. Entertainment, Inc."));
        System.out.println(miPeli);
        System.out.println();
        System.out.println("-------------------------------------------------");
        Libro miLibro = new Libro();
        miLibro.setNombre("El alquimista");
        miLibro.setEdicion("1ra edición");
        miLibro.setAutor(new Autor("Paulo Coelho", "Brasileño"));
        miLibro.setEditorial(new Editorial("Grijalbo", 1962));
        System.out.println(miLibro);
        System.out.println();
    
    }
    
}
