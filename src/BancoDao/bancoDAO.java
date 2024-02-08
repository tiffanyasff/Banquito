/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDao;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Admin;
import modelo.Banco;
import modelo.Persona;
import modelo.Prestamo;
import modelo.Socio;

/**
 *
 * @author pablo
 */
public class bancoDAO implements bancoInterfaceDao{
    
    Banco banco = new Banco();
    Admin AdminAactual = null;
    Socio SocioActual = null;
    
    
    
    
    @Override
    public void sumarDinero(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void procesarPago(Socio socio, int cantidad) {
        if (socio.getDinero() >= cantidad) {
            // Realizar la transacción
            socio.sumarDinero(-cantidad); // Restar la cantidad al comprador
            int nuevoSaldo = getBanco().getSaldoBanco() + cantidad; 
            getBanco().setSaldoBanco(nuevoSaldo);
            System.out.println("Pago procesado: " + cantidad + " unidades. Nuevo saldo del banco: " + getBanco().getSaldoBanco());
        } else {
            System.out.println("Error: Fondos insuficientes para realizar el pago.");
        }    
    }

    @Override
    public boolean esPrimerDiaDelMes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void realizarPago(Banco banco, int cantidad) {
         //System.out.println("Nombre del socio: " + nombre);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = getSocioActual().getFechaActual().format(formatter); 
        System.out.println("Fecha de transaccion: " + fechaFormateada);

        if (getSocioActual().getDinero() >= 25 && esPrimerDiaDelMes()) {
            System.out.println("Pago automatico realizado");
            procesarPago(getSocioActual(), cantidad);
        } else {
            System.out.println("No se ha realizado pago automatico");
        }
    }
    
     @Override
    public void crearPrestamo(String idSocio, int cantidadPrestamo, int cuotas) {
       
        Prestamo prestamo = new Prestamo (idSocio, cantidadPrestamo, cuotas) ;
         banco.guardarPrestamo(prestamo);
    }

    @Override
    public void crearUsuario(String nombre, String id, String tipo) {
        // Crear el objeto Persona basado en el tipo
        //Persona nuevoUsuario = null;
        if ("Admin".equalsIgnoreCase(tipo)) {   
            Admin nuevoUsuario = new Admin(nombre, id, tipo);
            banco.getAdministradores().add(nuevoUsuario);
            System.out.println("Usuario creado exitosamente: " );
        } else if ("Socio".equalsIgnoreCase(tipo)) {
            Socio nuevoUsuario = new Socio(nombre, id, tipo);
            banco.getSocios().add(nuevoUsuario);
            System.out.println("Usuario creado exitosamente: " );
        } else {
            System.out.println("Tipo de usuario no válido.");
            return; // Puedes manejar esto de acuerdo a tus requerimientos
        }
        System.out.println(banco.getAdministradores());
        System.out.println(banco.getSocios());
        
    } 
    
     @Override
    public void eliminarUsuario() {
        banco.getSocios().remove(SocioActual);
        System.out.println("eliminado");
    }
    
    @Override
    public void revisarSocio(String id) {
        
        for ( Persona socio : banco.getSocios()) {
            if (socio.getId().equals(id)){
                JOptionPane.showMessageDialog(null, "Balance actual: "+socio.getDinero());
                break; 
                
            }
                 
        }
        
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Admin getAdminAactual() {
        return AdminAactual;
    }

    public void setAdminAactual(Admin AdminAactual) {
        this.AdminAactual = AdminAactual;
    }

    public Socio getSocioActual() {
        return SocioActual;
    }

    public void setSocioActual(Socio SocioActual) {
        this.SocioActual = SocioActual;
    }
    
    
    
}
