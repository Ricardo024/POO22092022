/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author ricar
 */
public class Alumno extends Persona {
    private String numeroCuenta;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String carrera) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public Alumno(String numeroCuenta, String carrera, String Nombre, int Edad){
        super(Nombre, Edad);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numeroCuenta=" + numeroCuenta + ", carrera=" + carrera + '}';
    }
    
    public void estudiar(int cantidad){
        System.out.println(this.getNombre()+ "está estudiando" + cantidad + "Hrs");
    }
    //Polimorfismo por sobre escritura
    @Override
    public void dormir(){
        System.out.println("El estudiante " + this.getNombre() + "Está durmiendo 5 horas . . .");
    }
    
    //Polimorfismo por sobre carga
    
    public void dormir( int horasEstudio ){
        int horasDormir = 8;
        System.out.println(this.getNombre() 
                + "Está durmiendo " + (horasDormir - horasEstudio) + " Horas . . . ");
    }
}
