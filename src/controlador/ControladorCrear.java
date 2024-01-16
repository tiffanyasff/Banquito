/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import BancoDao.bancoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Persona;
import vista.VentanaCrear;
import vista.VentanaLogIn;

/**
 *
 * @author Andres
 */
public class ControladorCrear {
    
    private bancoDAO modelo;
    private VentanaCrear vista;

    public ControladorCrear(bancoDAO modelo, VentanaCrear vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.addBtnCrearListener(new btnCrearUsulistener());
        vista.addBtnVolverListener(new ListenerVolver());
       // vista.addBtnVolverListener(new btnVolverListener());
    }
    
        class btnCrearUsulistener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {


                String nombre = vista.getNombreJField().getText();
                String identificador = vista.getIdJField().getText();
                String tipo = "";
                if (vista.getjCheckBoxTipo().isSelected()) {
                    tipo = "Admin";
                }else{
                    tipo = "Socio";
                }


                if (nombre.isEmpty() || identificador.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos deben ser completados", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    return; // Salir del método si hay campos vacíos
                }


                if (existeUsuarioConIdentificador(identificador)) {
                    JOptionPane.showMessageDialog(null, "El identificador ya existe. Por favor, elija otro.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    return; 
             
                }else{
                    modelo.crearUsuario(nombre, identificador, tipo);
                


                    VentanaLogIn ventana = new VentanaLogIn();
                    ventana.setVisible(true);
                    ControladorLogIn cont = new ControladorLogIn(modelo, ventana);
                    vista.dispose();
                
                }
        }
    }
        
    private boolean existeUsuarioConIdentificador(String identificador) {
        for (Persona i : modelo.getBanco().getAdministradores()) {
            if (i.getId().equals(identificador)) {
                return true; 
            }
        }
        for (Persona i : modelo.getBanco().getSocios()) {
            if (i.getId().equals(identificador)) {
                return true; 
            }
        }
        return false;
    }
     class ListenerVolver implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            VentanaLogIn ventana = new VentanaLogIn();
            ventana.setVisible(true);
            ControladorLogIn cont = new ControladorLogIn(modelo, ventana);
            vista.dispose();
        }
        
    }
}
