
package Examen1_ProgramacionII;


public enum TipoPesquero {
    PEZ(150.0), CAMARON(200.0), LANGOSTA(250.0);
    public final double price;
    
    TipoPesquero(double price) {
        this.price = price;
    }
}
