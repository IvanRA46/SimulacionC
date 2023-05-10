/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulaciont;

/**
 *
 * @author ivann
 */
public class Coche extends Transporte{
    private Coche siguiente;
    private String marca;
    private String tipo;
    private int cilindraje;

    public Coche(String nombre, boolean placas, int capacidad, String marca, String tipo, int cilandraje) {
        super(nombre, placas, capacidad);
        this.marca = marca;
        this.tipo = tipo;
        this.cilindraje = cilandraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Coche getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Coche siguiente) {
        this.siguiente = siguiente;
    }

   
    
    
}
