package ElAlquimista;

import libro.componentes.Autor;
import libro.componentes.Editorial;


public class Libro {
    private String nombre;
    private String edicion;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String nombre, String edicion, Autor autor, Editorial editorial) {
        this.nombre = nombre;
        this.edicion = edicion;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", edicion=" + edicion + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    public void cambiarPagina(){
        System.out.println("Cambiando a la siguiente pagina");
    }
}
