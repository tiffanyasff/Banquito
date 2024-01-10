/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banquito;

import java.time.format.DateTimeFormatter;
import modelo.Banco;
import modelo.Socio;

/**
 *
 * @author USER CT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Socio socio = new Socio("Juan", "ID123", "socio");
        //socio.realizarPago();
      /*  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = socio.getFechaCreacion().format(formatter);

        System.out.println("Fecha de creación: " + fechaFormateada);*/
      
      Banco banco = new Banco();

        // Realizar un pago de 50 unidades
        socio.realizarPago(banco, 50);

        // Intentar realizar un pago de 100 unidades (fondos insuficientes)
        socio.realizarPago(banco, 100);

      
      
    }
    }
    
