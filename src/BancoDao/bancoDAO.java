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
    public void crearUsuario() {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el ID del usuario: ");
        String id = scanner.nextLine();

        System.out.print("Ingrese el tipo de usuario (Admin/Socio): ");
        String tipo = scanner.nextLine();

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
    
    
}
