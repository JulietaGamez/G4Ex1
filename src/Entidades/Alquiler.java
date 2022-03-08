/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: 
el nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del 
amarre y el barco que lo ocupará.
 */
package Entidades;

import Interfaz.calculoAlquiler;
import java.util.Date;

public class Alquiler implements calculoAlquiler {

    protected String nombreCliente;
    protected int documentoCliente;
    protected Date fechaAlquiler;
    protected Date fechaDevolucion;
    protected String posicionAmarre;
    protected Barco barco;
    protected int diasAlquiler;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, int documentoCliente, Date fechaAlquiler, Date fechaDevolucion, String posicionAmarre, Barco barco, int diasAlquiler) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        this.diasAlquiler = diasAlquiler;
    }

   

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    @Override
    public int calculoAlquiler() {
        
        int alquiler = this.diasAlquiler * (this.barco.getMtsEslora() * 10);
        alquiler= alquiler+this.getBarco().getModuloEspecial();
        System.out.println("El alquiler a pagar es de : "+ alquiler);
        return alquiler;
    }

    @Override
    public String toString() {
        return "Alquiler " + "\nNombreCliente= " + nombreCliente + 
                ",\nDocumentoCliente= " + documentoCliente 
                + ",\nFechaAlquiler= " + fechaAlquiler + 
                ", \nFechaDevolucion= " + fechaDevolucion + 
                "\nDias alquiler = " + diasAlquiler  +
                ", \nPosicion Amarre= " + posicionAmarre + 
                ", \nBarco= " + barco.toString() ;

    }

}
