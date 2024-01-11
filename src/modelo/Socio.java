/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



/**
 *
 * @author USER CT
 */
public class Socio extends Persona {
    
    private LocalDateTime fechaActual;
    ;
 

    public Socio (String nombre, String id, String tipo){      
        super(nombre, id, tipo);
        this.fechaActual = LocalDateTime.now();
        this.dinero = 1000;
    }
    
    public void sumarDinero(int cantidad) {
        dinero += cantidad;
    }
    
    private boolean esPrimerDiaDelMes() {
        return fechaActual.getDayOfMonth() == 1;
        
    }
     
     public void realizarPago(Banco banco, int cantidad) {
        //System.out.println("Nombre del socio: " + nombre);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = getFechaActual().format(formatter);
        System.out.println("Fecha de transaccion: " + fechaFormateada);

        if (dinero >= 25 && esPrimerDiaDelMes()) {
            System.out.println("Pago automatico realizado");
            banco.procesarPago(this, cantidad);
        } else {
            System.out.println("No se ha realizado pago automatico");
        }
    } 
    
     // Getter para obtener la fecha de creación
    public LocalDateTime getFechaActual() {
        return fechaActual;
    }
    
}
