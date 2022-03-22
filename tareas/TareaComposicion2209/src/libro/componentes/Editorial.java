package libro.componentes;

public class Editorial {
    private String nombre;
    private int fundacion;

    public Editorial() {
    }

    public Editorial(String nombre, int fundacion) {
        this.nombre = nombre;
        this.fundacion = fundacion;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", fundacion=" + fundacion + '}';
    }
    public void edicion(){
            System.out.println(this.nombre + " la edición se encuentra en Gandhi ");
    }
}
