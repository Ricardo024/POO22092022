
package libro;

public class ProyectoLibro {

    public static void main(String[] args) {
      Libro libro1 = new Libro ();
        System.out.println("Libro");
      libro1.setTitulo("Cien años de soledad");
        System.out.println("Titulo: " + libro1.getTitulo());
        libro1.setAutor("Gabriel Garcia Marquez");
        System.out.println("Autor: " + libro1.getAutor());
        libro1.setGenero("Narrativo");
        System.out.println("Genero:" + libro1.getGenero());
        libro1.setFecha(1967);
        System.out.println("Fecha de publicación: " + libro1.getFecha());
        libro1.setPrecio(250);
        System.out.println("Precio:$ " + libro1.getPrecio());
    }
  
}
