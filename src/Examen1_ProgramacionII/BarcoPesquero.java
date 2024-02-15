
package Examen1_ProgramacionII;

import javax.swing.JOptionPane;

public final class BarcoPesquero extends Barco {
    private int pecesCapturados;
    private TipoPesquero tipoBarco;
    
    public BarcoPesquero(String nombre, TipoPesquero tipoBarco) {
        super(nombre);
        this.tipoBarco = tipoBarco;
        pecesCapturados = 0;
    }
    
    @Override
    public void agregarElemento() {
        pecesCapturados++;
        JOptionPane.showMessageDialog(null, "¡Elemento agregado exitosamente! \nElemento(s) Actuales: " + pecesCapturados, "Elemento Agregado", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public double vaciarCobrar() {
        double total = pecesCapturados * tipoBarco.price;
        pecesCapturados = 0;
        return total;
    }
    
    @Override
    public double precioElemento() {
        return tipoBarco.price;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCarga de: " + tipoBarco + "\nPeces Capturados: " + pecesCapturados;
    }
}
