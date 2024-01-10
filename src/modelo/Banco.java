/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER CT
 */
public class Banco {
    
    private int saldoBanco;
    
    public Banco() {
        this.saldoBanco = 0;
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
    
}
