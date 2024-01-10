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
    
    private LocalDateTime fechaCreacion;
    ;
 

    public Socio (String nombre, String id, String tipo){      
        super(nombre, id, tipo);
        this.fechaCreacion = LocalDateTime.now();
        this.dinero = 1000;
    }
    
    public void sumarDinero(int cantidad) {
        dinero += cantidad;
    }
    
    private boolean esPrimerDiaDelMes() {
        return fechaCreacion.getDayOfMonth() == 1;
    }
     
     public void realizarPago(Banco banco, int cantidad) {
        //System.out.println("Nombre del socio: " + nombre);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = getFechaCreacion().format(formatter);
        System.out.println("Fecha de creación: " + fechaFormateada);

        if (esPrimerDiaDelMes()) {
            System.out.println("Estado: prime");
            banco.procesarPago(this, cantidad);
        } else {
            System.out.println("Estado: no prime");
        }
    } 
    
     // Getter para obtener la fecha de creación
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    
}
