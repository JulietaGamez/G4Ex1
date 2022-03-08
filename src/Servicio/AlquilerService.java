//Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de 
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente multiplicando 
//por 10 los metros de eslora).
//En los barcos de tipo especial el módulo de cada barco, se calcula sacando el modulo normal y 
//sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, 
//en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y 
//el número de camarotes.
//Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los métodos
//necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el precio final
//de su alquiler.
package Servicio;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoAmotor;
import Entidades.Velero;
import Entidades.Yate;
import java.util.Date;
import java.util.Scanner;

public class AlquilerService {
    BarcoAmotorService bmS= new BarcoAmotorService ();
    VeleroService vS = new VeleroService();
    YateService yS= new YateService();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler crearAlquiler(Barco b) {
        Alquiler a = new Alquiler();
        System.out.println("--- ALQUILER ---");
        System.out.println("--Datos personales:");
        System.out.println("Ingrese el nombre del cliente");
        a.setNombreCliente(leer.next());
        System.out.println("Ingrese el documento del cliente");
        a.setDocumentoCliente(leer.nextInt());
        System.out.println("Ingrese la posicion de amarre: babor, estribor, proa o popa");
        a.setPosicionAmarre(leer.next());
        System.out.println("--Fecha alquiler:");
        System.out.println("Ingrese el dia de alquiler");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de alquiler");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de alquiler");
        int anio = leer.nextInt();
        Date fAlq = new Date(anio - 1900, mes - 1, dia);
        a.setFechaAlquiler(fAlq);
        System.out.println("--Fecha de devolución:");
        System.out.println("Ingrese el dia de devolucion");
        int diaD = leer.nextInt();
        System.out.println("Ingrese el mes de devolucion");
        int mesD = leer.nextInt();
        System.out.println("Ingrese el año de devolucion");
        int anioD = leer.nextInt();
        Date fDeb = new Date(anioD - 1900, mesD - 1, diaD);
        a.setFechaDevolucion(fDeb);
        Long dia1= a.getFechaAlquiler().getTime();
        Long dia2=a.getFechaDevolucion().getTime();
        int dias = (int) (dia2-dia1);
        a.setDiasAlquiler(dias/(1000*60*60*24));
        a.setBarco(seleccionarBarco(b));
        a.calculoAlquiler();
       
        return a;
    }

    public Barco seleccionarBarco( Barco b) {
        String rta ="";
        do {
        System.out.println("Ingrese el Barco que desea alquilar");
         rta=leer.next();
        if (rta.equalsIgnoreCase("velero")) {
              b = vS.crearVelero();
              
            break;
        } else if (rta.equalsIgnoreCase("barco a motor")) {
             b = bmS.crearBarcoAmotor();
            break;
        } else if (rta.equalsIgnoreCase("yate")) {
             b= yS.crearYate();
            break;
        }
         } while (rta.equalsIgnoreCase("velero")|| rta.equalsIgnoreCase("barco a motor")|| rta.equalsIgnoreCase("yate"));
        return b;
    }

}


