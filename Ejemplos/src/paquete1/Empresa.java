/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private Vehiculos[] vehiculos;
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerVehiculos(Vehiculos[] v) {
        vehiculos = v;
    }

    public void calcularCostoB_I() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma = suma + edificios[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
    }

    public void calcularCostoVehiculos() {
        double suma = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            suma = suma + vehiculos[i].obtenerValor();
        }
        costoVehiculos = suma;
    }
    
    public void calcularCostoTotalBienes(){
        costoTotalBienes = costoBienesInmuebles + costoVehiculos;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public Vehiculos[] obtenerVehiculos() {
        return vehiculos;
    }
    
    
    @Override
    public String toString() {
        /*String reporte = String.format("\n%s (%.2f)", 
                obtenerNombre(), obtenerCosto());*/
        String reporte = String.format("%s\nLista de Edificios\n", nombre);
        for (int i = 0; i < edificios.length; i++) {
            reporte = String.format("%s%d. %s\n", reporte, (i + 1),
                    edificios[i].toString());
        }
        reporte = String.format("%sTotal de inmuebles: %.1f\n",
                reporte, costoBienesInmuebles);
        
        reporte = String.format("%s\nLista de Vehiculos\n", reporte);
        for (int i = 0; i < vehiculos.length; i++) {
            reporte = String.format("%s%d. %s\n", reporte, (i + 1),
                    vehiculos[i].toString());
        }
        reporte = String.format("%sTotal de inmuebles: %.1f\n",
                reporte, costoVehiculos);
        
        reporte = String.format("%s\nTotal de bienes: %.1f",
                reporte, costoTotalBienes);
        return reporte;
    }

}
