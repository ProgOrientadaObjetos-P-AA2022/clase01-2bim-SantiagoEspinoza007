/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.Estudiante;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Edgar Espinoza
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);

        String nombres = "";
        String apellido = "";
        String dni = "";
        int edad = 0;
        System.out.println("Ingrese un estudiante de tipo: \n"
                + "1. Presencial\n"
                + "2. Distancia");
        int opc = leer.nextInt();

        switch (opc) {
            case 1:
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                DatosEstudiante(estudianteP);
                System.out.println("Ingresar numero Creditos: ");
                int num = leer.nextInt();

                leer.nextLine();
                System.out.println("Ingresar Costo Creditos");
                double costoC = leer.nextDouble();
                estudianteP.establecerNumeroCreditos(num);
                estudianteP.establecerCostoCredito(costoC);
                estudianteP.calcularMatriculaPresencial();
                System.out.println("-------ESTUDIANTE PRESENCIAL-------");
                System.out.printf("%s\n", estudianteP);
                break;

            case 2:
                EstudianteDistancia estudianteD = new EstudianteDistancia();
                DatosEstudiante(estudianteD);
                System.out.println("Ingresar numero Asignaturas: ");
                int numA = leer.nextInt();
                leer.nextLine();
                System.out.println("Ingresar Costo Asignaturas");
                double costoA = leer.nextDouble();
                estudianteD.establecerNumeroAsginaturas(numA);
                estudianteD.establecerCostoAsignatura(costoA);
                estudianteD.calcularMatriculaDistancia();
                System.out.println("-------ESTUDIANTE DISTANCIA-------");
                System.out.printf("%s\n", estudianteD);
                break;

            default:
                System.out.println("Opcion ingresada incorrecta");
                break;
        }

    }

    public static void DatosEstudiante(Estudiante a) {
        Scanner leer = new Scanner(System.in);
        String nom;
        System.out.println("Ingrese los nombres: ");
        nom = leer.nextLine();
        String ape;
        System.out.println("Ingrese los apellidos: ");
        ape = leer.nextLine();
        String dni;
        System.out.println("Ingrese Identificación: ");
        dni = leer.nextLine();
        int edad;
        leer.nextLine();
        System.out.println("Ingresar edad: ");
        edad = leer.nextInt();
        a.establecerNombresEstudiante(nom);
        a.establecerApellidoEstudiante(ape);
        a.establecerIdentificacionEstudiante(dni);
        a.establecerEdadEstudiante(edad);
    }
}
