/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import BancoDao.bancoDAO;
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
        
    }
}
