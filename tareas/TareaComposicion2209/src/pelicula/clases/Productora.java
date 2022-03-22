package pelicula.clases;

public class Productora {
    
    private String nombre;
    private String marca;

    public Productora() {
    }
    public Productora(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", marca=" + marca + '}';
    }
    public void Actividad(){
        System.out.println("Se encuentra trabajando desde 1923");
    }
}
