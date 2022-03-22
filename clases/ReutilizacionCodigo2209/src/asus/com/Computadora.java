package asus.com;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author ricar
 */
public class Computadora {
    private String Marca;
    private String Modelo;
    private Monitor pantalla;
    private Mouse raton;
    private Teclado teclado;
    private Procesador cpu;

    public Computadora() {
        pantalla= new Monitor();
        raton= new Mouse();
        teclado= new Teclado();
        cpu= new Procesador();
    }

    public Computadora(String Marca, String Modelo, Monitor pantalla,
            Mouse raton, Teclado teclado, Procesador cpu) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.pantalla = pantalla;
        this.raton = raton;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    public Procesador getCpu() {
        return cpu;
    }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", pantalla=" + pantalla + ", raton=" + raton + ", teclado=" + teclado + ", cpu=" + cpu + '}';
 
    }
    

}
