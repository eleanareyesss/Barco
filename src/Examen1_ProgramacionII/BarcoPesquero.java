
package Examen1_ProgramacionII;

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
        pecesCapturados =+ 1;
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
}
