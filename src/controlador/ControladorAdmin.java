/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import BancoDao.bancoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaAdmin;
import vista.VentanaLogIn;

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
    /*vista.addBtnSalirListener(new SalirListener());
    vista.addBtnGananciasListener(new GananciasListener());
    vista.addBtnActualizarProductoListener(new ActualizarProductoListener());
    vista.addBtnEliminarProductoListener(new btnEliminarProducto());
    vista.addBtnPerfilListener(new btnModificarUsuario());*/
        
    }
    
        class SalirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            VentanaLogIn ventana = new VentanaLogIn();
            ventana.setVisible(true);
            vista.dispose();
            ControladorLogIn cont = new ControladorLogIn(modelo, ventana);
        }
    
    
    }
    
}
