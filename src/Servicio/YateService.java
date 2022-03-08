/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidades.Yate;
import java.util.Scanner;

public class YateService {
    Scanner leer= new Scanner(System.in);
    public Yate crearYate(){
        Yate y= new Yate();
        System.out.println("---Yate---");
        System.out.println("Matricula:");
        y.setMatricula(leer.nextInt());
        System.out.println("Eslora en metros:");
        y.setMtsEslora(leer.nextInt());
        System.out.println("Año de fabricacion");
        y.setAnioFabricacion(leer.nextInt());
        System.out.println("Potencia en CV");
        y.setPotenciaCV(leer.nextInt());
        System.out.println("Numero de camarotes");
        y.setNumCamarotes(leer.nextInt());
        y.setModuloEspecial(y.getNumCamarotes()+y.getPotenciaCV());
        return y;
        
    }
}
