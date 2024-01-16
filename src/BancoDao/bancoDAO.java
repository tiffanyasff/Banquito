/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDao;

import java.util.Scanner;
import modelo.Admin;
import modelo.Banco;
import modelo.Persona;
import modelo.Socio;

/**
 *
 * @author pablo
 */
public class bancoDAO implements bancoInterfaceDao{
    
    Banco banco = new Banco();
    Admin AdminAactual = null;
    Admin SocioActual = null;
    
    
    
    
    @Override
    public void sumarDinero(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void procesarPago(Socio socio, int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esPrimerDiaDelMes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void realizarPago(Banco banco, int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public Admin getSocioActual() {
        return SocioActual;
    }

    public void setSocioActual(Admin SocioActual) {
        this.SocioActual = SocioActual;
    }
    
    
    
}
