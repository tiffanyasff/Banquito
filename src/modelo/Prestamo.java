/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER CT
 */
public class Prestamo {
    
    private String idSocio;
    private int cantidadPrestamo;
    private int cuotas;
    
    
    public Prestamo (String idSocio, int cantidadPrestamo, int cuotas){
        this.idSocio = idSocio;
        this.cantidadPrestamo = cantidadPrestamo;
        this.cuotas = cuotas;
    }

    public String getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(String idSocio) {
        this.idSocio = idSocio;
    }

    public int getCantidadPrestamo() {
        return cantidadPrestamo;
    }

    public void setCantidadPrestamo(int cantidadPrestamo) {
        this.cantidadPrestamo = cantidadPrestamo;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
    
    

    
}
