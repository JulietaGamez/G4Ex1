/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.BarcoAmotor;
import java.util.Scanner;

/**
 *
 * @author julietagamez
 */
public class BarcoAmotorService {
    Scanner leer= new Scanner(System.in);
    public BarcoAmotor crearBarcoAmotor(){
        BarcoAmotor bAm= new BarcoAmotor();
        System.out.println("---BARCO A MOTOR---");
        System.out.println("Matricula:");
        bAm.setMatricula(leer.nextInt());
        System.out.println("Eslora en metros:");
        bAm.setMtsEslora(leer.nextInt());
        System.out.println("Año de fabricacion");
        bAm.setAnioFabricacion(leer.nextInt());
        System.out.println("Potencia en CV");
        bAm.setPotenciaCV(leer.nextInt());
        bAm.setModuloEspecial(bAm.getPotenciaCV());
        return bAm;
    }
    
}
