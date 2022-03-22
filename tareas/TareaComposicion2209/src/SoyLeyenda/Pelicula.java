/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoyLeyenda;

import pelicula.clases.Actor;
import pelicula.clases.Director;
import pelicula.clases.Productora;

public class Pelicula {

     private String nombre;
     private int duracion;
     private Actor Estelar;
     private Productora productora;
     private Director director;

    public Pelicula() {
    }

    public Pelicula(String nombre, int duracion, Actor Estelar, Productora productora, Director director) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.Estelar = Estelar;
        this.productora = productora;
        this.director = director;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Actor getEstelar() {
        return Estelar;
    }

    public void setEstelar(Actor Estelar) {
        this.Estelar = Estelar;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre= " + nombre + ", duración en min= " +  duracion + ", " +  Estelar + ", " + productora + ", " + director + '}';
    }
    public void tiempo(){
        System.out.println("Han pasado 86 min");
    }
}
