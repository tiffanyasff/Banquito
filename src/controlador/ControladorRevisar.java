/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import BancoDao.bancoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaAdmin;
import vista.VentanaRevisarSocio;

/**
 *
 * @author Andres
 */
public class ControladorRevisar {
    
    private bancoDAO modelo;
    private VentanaRevisarSocio vista;
    
    
    public ControladorRevisar(bancoDAO modelo, VentanaRevisarSocio vista) {
    this.modelo = modelo;
    this.vista = vista;
     vista.addBtnSalirListener(new ControladorRevisar.SalirListener());   
    }
    
    class SalirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            VentanaAdmin ventana = new VentanaAdmin ();
            ventana.setVisible(true);
            vista.dispose();
            ControladorAdmin cont = new ControladorAdmin(modelo, ventana);
        }
 
    }
}
