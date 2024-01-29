/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import BancoDao.bancoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.VentanaLogIn;
import vista.VentanaSocio;

/**
 *
 * @author Andres
 */
public class ControladorSocio {
    
    private bancoDAO modelo;
    private VentanaSocio vista;
    
    public ControladorSocio(bancoDAO modelo, VentanaSocio vista) {
    this.modelo = modelo;
    this.vista = vista;
    vista.addBtnEliminarListener(new btnEliminarListener());
     vista.addBtnSalirListener(new SalirListener());
    
    }
    
    class btnEliminarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar Su cuenta?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                modelo.eliminarUsuario();
                VentanaLogIn ventana = new VentanaLogIn();
                ventana.setVisible(true);
                vista.dispose();
                ControladorLogIn cont = new ControladorLogIn(modelo, ventana); 
            }          
        }
    }
    
        class SalirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            VentanaLogIn ventana = new VentanaLogIn();
            ventana.setVisible(true);
            vista.dispose();
            ControladorLogIn cont = new ControladorLogIn(modelo, ventana);
            modelo.setSocioActual(null);
        }
 
    }
}
