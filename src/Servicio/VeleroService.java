/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Velero;
import java.util.Scanner;

public class VeleroService {
    Scanner leer= new Scanner(System.in);
    public Velero crearVelero(){
        Velero v= new Velero();
        System.out.println("---VELERO---");
        System.out.println("Matricula:");
        v.setMatricula(leer.nextInt());
        System.out.println("Eslora en metros:");
        v.setMtsEslora(leer.nextInt());
        System.out.println("Año de fabricacion");
        v.setAnioFabricacion(leer.nextInt());
        System.out.println("Numero de mástiles");
        v.setNumeroMastiles(leer.nextInt());
        v.setModuloEspecial(v.getNumeroMastiles());
        return v;
        
    }

}
