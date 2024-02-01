/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author USER CT
 */
public class Banco {
    
    private int saldoBanco;
    private ArrayList<Persona> socios;
    private ArrayList<Persona> administradores;
    private ArrayList<Prestamo> prestamos;
    
    
    public Banco() {
        this.saldoBanco = 0;
        this.socios = new ArrayList<Persona>();
        this.administradores = new ArrayList<Persona>();
        this.prestamos = new ArrayList<Prestamo>();
        
    }
    
    public void procesarPago(Socio socio, int cantidad) {
        if (socio.getDinero() >= cantidad) {
            // Realizar la transacción
            socio.sumarDinero(-cantidad); // Restar la cantidad al comprador
            saldoBanco += cantidad; // Sumar la cantidad al saldo del banco
            System.out.println("Pago procesado: " + cantidad + " unidades. Nuevo saldo del banco: " + saldoBanco);
        } else {
            System.out.println("Error: Fondos insuficientes para realizar el pago.");
        }    
    }
    
    public void guardarPrestamo(Prestamo prestamo){
    
         getPrestamos().add(prestamo);
         System.out.println("sisa manito");//has que se imprima el prestamo desde el vector no seas peye
    }
    
    public int getSaldoBanco() {
        return saldoBanco;
    }

    public void setSaldoBanco(int saldoBanco) {
        this.saldoBanco = saldoBanco;
    }

    public ArrayList<Persona> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Persona> socios) {
        this.socios = socios;
    }

    public ArrayList<Persona> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Persona> usuarios) {
        this.administradores = usuarios;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    
    
    
    
}
