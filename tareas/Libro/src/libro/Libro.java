
package libro;


public class Libro {
    private String titulo;
    private String genero;
    private String autor;
    private int fecha;
    private int precio;

    public Libro() {
    }

    public Libro(String titulo, String genero, String autor, int fecha, int precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.fecha = fecha;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}
