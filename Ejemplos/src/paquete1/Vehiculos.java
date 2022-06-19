/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Edgar Espinoza
 */
public class Vehiculos {
    private String tipo;
    private String matricula;
    private double valor;
    
    public Vehiculos(String t, String m){
        tipo = t;
        matricula = m;
        
    }
    
    public void establecerTipo(String t){
        tipo = t;
    }
    
    public void establecerMatricula(String m){
        matricula = m;
    }
    
    public void establecerValor(double v){
        valor = v;
    }
    public String obtenerTipo(){
        return tipo;
    }
    
    public String obtenerMatricula(){
        return matricula;
    }
    
    public double obtenerValor(){
        return valor;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("%s, %s (%.1f)", 
                tipo, matricula, valor);
        return reporte;
    }
}
