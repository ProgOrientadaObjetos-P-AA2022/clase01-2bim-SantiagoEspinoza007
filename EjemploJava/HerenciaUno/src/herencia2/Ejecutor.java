/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;

/**
 *
 * @author Edgar Espinoza
 */
public class Ejecutor {

    public static void main(String[] args) {
        EstudianteDistancia estudiante = new EstudianteDistancia();
        
        estudiante.establecerNombresEstudiante("Edgar Santiago");
        estudiante.establecerApellidoEstudiante("Espinoza Velásquez");
        estudiante.establecerIdentificacionEstudiante("1106042185");
        estudiante.establecerEdadEstudiante(18);
        estudiante.establecerNumeroAsginaturas(5);
        estudiante.establecerCostoAsignatura(300);
        estudiante.calcularMatriculaDistancia();
        /*
        System.out.printf("\n%s - (%.2f)\n", 
                estudiante.obtenerApellidoEstudiante(),
                estudiante.obtenerMatriculaDistancia());
        */
        
        System.out.printf("%s\n", estudiante);
    }
}
