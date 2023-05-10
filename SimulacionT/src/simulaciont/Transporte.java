/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulaciont;

/**
 *
 * @author ivann
 */
public class Transporte {
    private String nombre;
    private boolean placas;
    private int capacidad;

    public Transporte(String nombre, boolean placas, int capacidad) {
        this.nombre = nombre;
        this.placas = placas;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getPlacas() {
        return placas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPlacas(boolean placas) {
        this.placas = placas;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
