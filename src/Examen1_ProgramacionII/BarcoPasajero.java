
package Examen1_ProgramacionII;

import java.util.Scanner;
import javax.swing.JOptionPane;


public final class BarcoPasajero extends Barco{
    private String[] nombrePasajeros;
    private double precioBoleto;
    private int contadorPasajeros;
    
    public BarcoPasajero(String nombre, int limitePasajeros, double precioBoleto) {
        super(nombre);
        nombrePasajeros = new String[limitePasajeros];
        this.precioBoleto = precioBoleto;
        contadorPasajeros = 0;
    }
    
    @Override
    public void agregarElemento() {
        if (contadorPasajeros < nombrePasajeros.length) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del pasajero: ", "Agregar Elemento", JOptionPane.OK_CANCEL_OPTION);
            nombre = nombre.toUpperCase();
             
            if (nombre.isBlank() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete el campo de Nombre.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                nombrePasajeros[contadorPasajeros] = nombre;
                contadorPasajeros++;
                JOptionPane.showMessageDialog(null, "¡Elemento agregado exitosamente! \nPasajeros Actuales: " + contadorPasajeros, "Elemento Agregado", JOptionPane.INFORMATION_MESSAGE);
            }
   
        } else {
            JOptionPane.showMessageDialog(null, "El barco ya alcanzó su límite de pasajeros.", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
        
    @Override
    public double vaciarCobrar() {
        double total = contadorPasajeros * precioBoleto;
        contadorPasajeros = 0;
        return total;
    }
    
    @Override
    public double precioElemento() {
        return precioBoleto;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCantidad de Pasajeros que compraron boleto: " + contadorPasajeros;
    }
    
    public void listarPasajeros() {
        listarPasajeros(0);
    }
    
    private void listarPasajeros(int index) {
        if (index < nombrePasajeros.length) {
            if (nombrePasajeros[index] != null) {
                System.out.println(index + 1 + ".- " + nombrePasajeros[index]);
            } 
            listarPasajeros(index + 1);
        }
    }
}
