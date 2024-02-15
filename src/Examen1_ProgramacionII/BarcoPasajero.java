
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
            Scanner lector = new Scanner(System.in);
            System.out.print("Nombre de Pasajero: ");
            nombrePasajeros[contadorPasajeros] = lector.nextLine();
            contadorPasajeros++;
        } else {
            System.out.println("              ¡ADVERTENCIA!               ");
            System.out.println("El barco ya alcanzó su límite de pasajeros");
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
