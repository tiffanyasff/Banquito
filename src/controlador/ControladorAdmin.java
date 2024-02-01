/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import BancoDao.bancoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Prestamo;
import vista.VentanaAdmin;
import vista.VentanaLogIn;
import vista.VentanaRevisarSocio;

/**
 *
 * @author Andres
 */
public class ControladorAdmin {
    
    private bancoDAO modelo;
    private VentanaAdmin vista;
    
    public ControladorAdmin(bancoDAO modelo, VentanaAdmin vista) {
    this.modelo = modelo;
    this.vista = vista;
    vista.getJLabelNombre().setText(modelo.getAdminAactual().getNombre());
    vista.addBtnSalirListener(new SalirListener());
    vista.addBtnRevisarSocioListener(new RevisarSocioListener());
    vista.addBtnPrestamoListener(new PrestamoListener());
    /*vista.addBtnActualizarProductoListener(new ActualizarProductoListener());
    vista.addBtnEliminarProductoListener(new btnEliminarProducto());
    vista.addBtnPerfilListener(new btnModificarUsuario());*/
        
    }
    //poner lisener salir, ver socio y prestamo
        class SalirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            VentanaLogIn ventana = new VentanaLogIn();
            ventana.setVisible(true);
            vista.dispose();
            ControladorLogIn cont = new ControladorLogIn(modelo, ventana);
            modelo.setAdminAactual(null);
        }
        
    }
        
        class RevisarSocioListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            VentanaRevisarSocio ventana = new VentanaRevisarSocio();
            ventana.setVisible(true);
            vista.dispose();
            ControladorRevisar cont = new ControladorRevisar(modelo, ventana);
        }

        
    }
        
        class PrestamoListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //con el get text coger la info y ponersela al prestamo uuuuuuuu
           int cantidadPrestamo = Integer.parseInt(vista.getCantidadJField().getText());
           int cuotas = Integer.parseInt(vista.getCuotasJField().getText());
           String idSocio = vista.getIdJField().getText();
           
           modelo.crearPrestamo(idSocio, cantidadPrestamo,cuotas);
           
        }
        
    }
     
    
}
