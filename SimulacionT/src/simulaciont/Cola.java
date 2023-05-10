/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulaciont;

import javax.swing.JOptionPane;

/**
 *
 * @author ivann
 */
public class Cola {
    public Coche cola;
    
    public Cola() {
        cola = null;
    }
    
     public void encolar(String nombre, boolean placas, int capacidad, String marca, String tipo, int cilandraje) {
        Coche nuevo = new Coche(nombre, placas, capacidad, marca, tipo, cilandraje);
        if (cola == null) {
            cola = nuevo;
        } else {
            Coche aux = cola;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        JOptionPane.showMessageDialog(null, "Coche:" + nuevo.getNombre() + " encolado.", "Bien", JOptionPane.INFORMATION_MESSAGE);
    }

    public void recorrerCola() {
        Coche aux = cola;
        if (cola == null) {
            JOptionPane.showMessageDialog(null, "La cola está vacía.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            StringBuilder valores = new StringBuilder();
            while (aux != null) {
                valores.append("Nombre: ").append(aux.getNombre()).append("\n");
                valores.append("Ubicación: ").append(aux.getPlacas()).append("\n");
                valores.append("Entrada: ").append(aux.getCapacidad()).append("\n");
                valores.append("Capacidad: ").append(aux.getMarca()).append("\n");
                valores.append("Tiene sombrillas: ").append(aux.getTipo()).append("\n");
                valores.append("Restaurante: ").append(aux.getCilindraje()).append("\n\n\n");
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, valores);
        }
    }

    public void desencolar() {
        Coche aux = cola;
        int valor = 0;
        if (cola == null) {
            JOptionPane.showMessageDialog(null, "La cola está vacía.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            if (aux.getSiguiente() == null) {
                valor = aux.getCapacidad();
                cola = null;
            } else {
                valor = aux.getCapacidad();
                cola = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Elemento con valor " + valor + " eliminado de la cola.", "Bien", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
