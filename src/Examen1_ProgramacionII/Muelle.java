
package Examen1_ProgramacionII;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Muelle {
    private ArrayList<Barco> barcos;
    
    public Muelle() {
        barcos = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Muelle muelle = new Muelle();
        
        Scanner lector = new Scanner(System.in);

        int opcion=0;
        
        do {
            System.out.println("===========MENÚ PRINCIPAL===========");
            System.out.println("        1- AGREGAR BARCO            ");
            System.out.println("        2- AGREGAR ELEMENTO         ");
            System.out.println("        3- VACIAR BARCO             ");
            System.out.println("        4- BARCOS POR FECHA         ");
            System.out.println("        5- SALIR                    ");
            System.out.println("====================================");
            System.out.print("          Ingrese el Código: ");
            opcion = lector.nextInt();
            lector.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("==========AGREGAR BARCO==========");
                    System.out.println(" Tipos: (PESQUERO / PASAJERO)");
                    System.out.print("Seleccione un tipo de barco: ");
                    String tipoBarco = lector.nextLine();
                    
                    if (tipoBarco != null) {
                        muelle.agregarBarco(tipoBarco);
                    }
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("");
                    System.out.println("==========AGREGAR ELEMENTO==========");
                    System.out.print("Nombre del Barco: ");
                    String nombreBarco = lector.nextLine().toUpperCase();
                    
                    if (nombreBarco != null) {
                        muelle.agregarElemento(nombreBarco);
                    }
                    System.out.println("");
                    break;
                
                case 3:
                    System.out.println("");
                    System.out.println("==========VACIAR BARCO==========");
                    System.out.print("Nombre del Barco: ");
                    nombreBarco = lector.nextLine().toUpperCase();
                    
                    if (nombreBarco != null) {
                        double total = muelle.vaciarBarco(nombreBarco);
                        System.out.println("Total General: $. " + total);
                    }
                    System.out.println("");
                    break;
                    
                case 4: 
                    System.out.println("");
                    System.out.println("==========BARCOS POR FECHA==========");
                    System.out.print("Año: ");
                    int año = lector.nextInt();
                    
                    if (año != -1) {
                        muelle.barcosDesde(año);
                    }
                    System.out.println("");
                    break;
                    
                default:
                    System.out.println("");
                    System.out.println("SALIENDO CON ÉXITO DEL PROGRAMA...");
                    break;
            }
            
        } while (opcion != 5);
    }
    
    private Barco buscarBarco(String nombre) {
        for (Barco barcoNombre : barcos) {
            if (barcoNombre.getNombre().equals(nombre)) {
                return barcoNombre;
            }
        }
        return null;
    }
    
    private void agregarBarco(String tipo) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Nombre del Barco: ");
        String nombre = lector.nextLine().toUpperCase();
        
        if (buscarBarco(nombre) != null) {
            System.out.println("El barco ya existe.");
            return;
        } else {
            switch (tipo.toUpperCase()) {
                case "PESQUERO":
                    System.out.println("");
                    System.out.println("Tipos: (Pez / Camaron / Langosta)");
                    System.out.print("¿Qué tipo de barco pesquero?: ");
                    String tipoPesquero = lector.nextLine().toUpperCase();
                    
                    if (tipoPesquero.equals("PEZ")) {
                        BarcoPesquero barcoPesquero = new BarcoPesquero(nombre, TipoPesquero.PEZ);
                        barcos.add(barcoPesquero);
                        System.out.println("¡Barco Agregado Exitosamente!");
                    } else if (tipoPesquero.equals("CAMARON")) {
                        BarcoPesquero barcoPesquero = new BarcoPesquero(nombre, TipoPesquero.CAMARON);
                        barcos.add(barcoPesquero);
                        System.out.println("¡Barco Agregado Exitosamente!");
                    } else if (tipoPesquero.equals("LANGOSTA")) {
                        BarcoPesquero barcoPesquero = new BarcoPesquero(nombre, TipoPesquero.LANGOSTA);
                        barcos.add(barcoPesquero);
                        System.out.println("¡Barco Agregado Exitosamente!");
                    } else {
                        System.out.println("Tipo de barco pesquero no válido.");
                    }
                    System.out.println("");
                    break;
                    
                case "PASAJERO":
                    System.out.println("");
                    System.out.print("Limite de Pasajeros: ");
                    int limitePasajeros = lector.nextInt();
                    
                    System.out.print("Precio de Boleto: $. ");
                    double precioBoleto = lector.nextDouble();
                    
                    BarcoPasajero barcoPasajero = new BarcoPasajero(nombre, limitePasajeros, precioBoleto);
                    barcos.add(barcoPasajero);
                    System.out.println("¡Barco Agregado Exitosamente!");
                    System.out.println("");
                    break;
                    
                default: 
                    System.out.println("Tipo de barco inválido.");
                    System.out.println("");
                    break;
            }
        }
    }
    
    private void agregarElemento(String nombre) {
        Barco barcoEncontrado = buscarBarco(nombre);
        if (barcoEncontrado != null) {
            barcoEncontrado.agregarElemento();
            System.out.println("¡Elemento Agregado Exitosamente!");
        } else {
            System.out.println("El barco '" + nombre + "' no existe.");
        }
    }
    
    private double vaciarBarco(String nombre) {
        Barco barcoEncontrado = buscarBarco(nombre);
        if (barcoEncontrado != null) {
            if (barcoEncontrado instanceof BarcoPasajero) {
                System.out.println("Listado de Pasajeros: ");
                ((BarcoPasajero) barcoEncontrado).listarPasajeros();
                System.out.println("");
            }
        }
        return barcoEncontrado.vaciarCobrar();
    }
    
    private void barcosDesde(int year) {
        barcosDesdeRecursivo(year, 0);
    }

    private void barcosDesdeRecursivo(int year, int index) {
        if (index < barcos.size()) {
            Barco barco = barcos.get(index);
            if (barco.getFechaCiruculacion().get(Calendar.YEAR) >= year) {
                System.out.println("Nombre: " + barco.getNombre() + ", Fecha de Circulación: " + barco.getFechaCiruculacion().getTime());
            }
            barcosDesdeRecursivo(year, index + 1);
        }
    }
}
