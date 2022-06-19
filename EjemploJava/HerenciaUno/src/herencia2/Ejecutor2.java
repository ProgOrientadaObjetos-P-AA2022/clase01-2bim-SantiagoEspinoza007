/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author EdgarEspinoza
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        EstudiantePresencial estudiante = new EstudiantePresencial();
        System.out.println("Ingrese los nombre: ");
        String nombres = leer.nextLine();
        estudiante.establecerNombresEstudiante(nombres);
        System.out.println("Ingrese los apellidos: ");
        String apellido = leer.nextLine();
        estudiante.establecerApellidoEstudiante(apellido);
        System.out.println("Ingrese Identificación: ");
        String dni = leer.nextLine();
        estudiante.establecerIdentificacionEstudiante(dni);
        leer.nextLine();
        System.out.println("Ingresar edad: ");
        int edad = leer.nextInt();
        estudiante.establecerEdadEstudiante(edad);
        System.out.println("Ingresar numeroCreditos: ");
        int num = leer.nextInt();
        estudiante.establecerNumeroCreditos(num);
        leer.nextLine();
        System.out.println("Ingresar Costo Creditos");
        double costoC = leer.nextDouble();
        estudiante.establecerCostoCredito(costoC);
        estudiante.calcularMatriculaPresencial();
        /*
        System.out.printf("\n%s - (%.2f)\n", 
                estudiante.obtenerApellidoEstudiante(),
                estudiante.obtenerMatriculaDistancia());
        */
        
        System.out.printf("%s\n", estudiante);
    }
}
