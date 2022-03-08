/*
  Número de mástiles para veleros.

 */
package Entidades;



public class Velero extends Barco {
    private int numeroMastiles;

    public Velero() {
    }

    public Velero(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
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

    public int getModuloEspecial() {
        return moduloEspecial;
    }

    public void setModuloEspecial(int moduloEspecial) {
        this.moduloEspecial = moduloEspecial;
    }
    

    @Override
    public String toString() {
        return "Velero " + 
                "\n NumeroMastiles: " + numeroMastiles + 
                "\nAño de fabricacion: "+ super.anioFabricacion +
                "\nEslora "+ super.mtsEslora + 
                "\nMatricula "+super.getMatricula() ;
    }

    
}
