/*
 
• Potencia en CV para barcos a motor.

 */
package Entidades;

import Interfaz.calculoAlquiler;

/**
 *
 * @author julietagamez
 */
public class BarcoAmotor extends Barco implements calculoAlquiler{
    private int potenciaCV;

    public BarcoAmotor() {
    }

    public BarcoAmotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoAmotor(int potenciaCV, int matricula, int mtsEslora, int anioFabricacion, int moduloEspecial) {
        super(matricula, mtsEslora, anioFabricacion, moduloEspecial);
        this.potenciaCV = potenciaCV;
    }

    public int getModuloEspecial() {
        return moduloEspecial;
    }

    public void setModuloEspecial(int moduloEspecial) {
        this.moduloEspecial = moduloEspecial;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMtsEslora() {
        return mtsEslora;
    }

    public void setMtsEslora(int mtsEslora) {
        this.mtsEslora = mtsEslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public int calculoAlquiler() {
        int alquilerBm =0;
       alquilerBm = alquilerBm + this.potenciaCV;
        return alquilerBm;
    }

    @Override
    public String toString() {
        return "BarcoAmotor " + "\npotenciaCV= " + potenciaCV + 
               "\nAño de fabricacion: "+ super.anioFabricacion +
                "\nEslora "+ super.mtsEslora + 
                "\nMatricula "+super.getMatricula();
    }
    
}
