/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.VentanaLogIn;
import BancoDao.bancoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Admin;
import modelo.Banco;
import modelo.Persona;
import modelo.Socio;
import vista.VentanaCrear;

/**
 *
 * @author Andres
 */
public class ControladorLogIn {
    
    private bancoDAO modelo;
    private VentanaLogIn vista;

    public ControladorLogIn(bancoDAO modelo, VentanaLogIn vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.addBtnCrearListener(new ListenerCrear());
    }
    
    public void hacerLogIn(String nombre, String ID){
        
        for (Persona i : modelo.getBanco().getAdministradores()){
        
            if (i.getNombre().equals(nombre) && i.getId().equals(ID)) {
                Admin adminActual = (Admin) i;  
                break;  
            } 
            else {
            System.out.println("No se encontró un administrador con el nombre e ID proporcionados.");
            }
        }
        for (Persona i : modelo.getBanco().getSocios()){
        
            if (i.getNombre().equals(nombre) && i.getId().equals(ID)) {
                Socio socioActual = (Socio) i;  
                break;  
            }else{
                System.out.println("No se encontró un socio con el nombre e ID proporcionados.");
            }
        }
    }
    
    class ListenerCrear implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            VentanaCrear ventana = new VentanaCrear();
            ventana.setVisible(true);
            ControladorCrear cont = new ControladorCrear(modelo, ventana);
            vista.dispose();
        }
        
    }

    public bancoDAO getModelo() {
        return modelo;
    }

    public void setModelo(bancoDAO modelo) {
        this.modelo = modelo;
    }

    public VentanaLogIn getVista() {
        return vista;
    }

    public void setVista(VentanaLogIn vista) {
        this.vista = vista;
    }
    
    
    
}


