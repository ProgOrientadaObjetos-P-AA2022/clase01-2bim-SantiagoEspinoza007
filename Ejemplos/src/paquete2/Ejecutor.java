/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculos;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("edificio central");
        edf1.establecerCostos(10000);
        //System.out.println(edf1);
        Edificio edf2 = new Edificio("edificio sur");
        edf2.establecerCostos(20000);
        Edificio edf3 = new Edificio("edificio norte");
        edf3.establecerCostos(30000);
        Edificio edf4 = new Edificio("edificio secundario");
        edf4.establecerCostos(20000);
        
        Vehiculos ve1 = new Vehiculos("Auto", "LBB0011");
        ve1.establecerValor(10000);
        Vehiculos ve2 = new Vehiculos("Camioneta", "LCB0011");
        ve2.establecerValor(20000);
        Vehiculos ve3 = new Vehiculos("Auto", "LBD0012");
        ve3.establecerValor(6000);
        Vehiculos ve4 = new Vehiculos("Camioneta", "LCC0011");
        ve4.establecerValor(10000);
        Vehiculos ve5 = new Vehiculos("Camioneta", "LDC0011");
        ve5.establecerValor(25000);
        
        
        // Crear un objeto de tipo Empresa:
        /*
        Edificio [] e = new Edificio [4];
        e[0]= edf1;
        e[1]= edf2;
        e[2]= edf3;
        e[3]= edf4;
        */
        
        Edificio [] e = {edf1, edf2, edf3, edf4};
        
        Vehiculos [] v ={ve1, ve2, ve3, ve4, ve5};
        
        Empresa em = new Empresa();
        em.establecerNombre("Empresa de Hojas");
        em.establecerEdificios(e);
        em.establecerVehiculos(v);
        em.calcularCostoB_I();
        em.calcularCostoVehiculos();
        em.calcularCostoTotalBienes();
        System.out.printf("\n%s\n", em);
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        // Imprimir el costo de los bienes inmuebles de la empresa
    }
}
