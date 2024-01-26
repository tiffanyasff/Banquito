/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import BancoDao.bancoDAO;
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
    }
}
