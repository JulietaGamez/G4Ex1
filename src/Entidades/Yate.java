/*

• Potencia en CV y número de camarotes para yates de lujo.
 */
package Entidades;



public class Yate extends Barco {
    private int potenciaCV;
    private int numCamarotes;

    public Yate() {
    }

    public Yate(int potenciaCV, int numCamarotes) {
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public Yate(int potenciaCV, int numCamarotes, int matricula, int mtsEslora, int anioFabricacion, int moduloEspecial) {
        super(matricula, mtsEslora, anioFabricacion, moduloEspecial);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
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

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
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
    public String toString() {
        return "Yate " + "\nPotenciaCV= " + potenciaCV + 
                "\nNumCamarotes= " + numCamarotes + 
                "\nAño de fabricacion: "+ super.anioFabricacion +
                "\nEslora "+ super.mtsEslora + 
                "\nMatricula "+super.getMatricula();
    }
    
}
