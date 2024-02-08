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
    
    //tal vez esta funcion deba cambiar i poner el for esprimer dia afuera y adentro un if con realizar pago si le alcanza la plata
 
    
     // Getter para obtener la fecha de creación
    public LocalDateTime getFechaActual() {
        return fechaActual;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    
    
}
