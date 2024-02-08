/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BancoDao;

import modelo.Banco;
import modelo.Socio;

/**
 *
 * @author pablo
 */
public interface bancoInterfaceDao {
    
    public void sumarDinero(int cantidad);
    public void procesarPago(Socio socio, int cantidad);
    public boolean esPrimerDiaDelMes();
    public void realizarPago(Banco banco, int cantidad);
    public void crearUsuario(String nombre, String id, String tipo);
    public void eliminarUsuario();
    public void crearPrestamo(String idSocio, int cantidadPrestamo, int cuotas);
    public void revisarSocio (String id);
   
    
    
    
    
    
}
