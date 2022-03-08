/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */
package Entidades;



public class Barco {
    protected int matricula;
    protected int mtsEslora;
    protected int anioFabricacion;
    protected int moduloEspecial;

    public Barco() {
    }

    public Barco(int matricula, int mtsEslora, int anioFabricacion, int moduloEspecial) {
        this.matricula = matricula;
        this.mtsEslora = mtsEslora;
        this.anioFabricacion = anioFabricacion;
        this.moduloEspecial = moduloEspecial;
    }

    public int getModuloEspecial() {
        return moduloEspecial;
    }

    public void setModuloEspecial(int moduloEspecial) {
        this.moduloEspecial = moduloEspecial;
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

    
    
}
