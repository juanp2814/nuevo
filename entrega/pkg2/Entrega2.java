/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrega.pkg2;

import listaDepartementos.Presentacion.IniciarSesion;
import listaDepartementos.Presentacion.VentanaPrincipal;

/**
 *
 * @author MSI
 */
public class Entrega2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresa=new Empresa("Compu");
        Usuario usuario=new Usuario(Permanente", "Juan", 123, "Juan Pedro", 1);
        
        VentanaPrincipal ventana=new VentanaPrincipal(empresa);
        IniciarSesion sesion=new IniciarSesion(ventana,false,empresa,ventana);
        sesion.setVisible(true);
        ventana.setVisible(true);
        
        // TODO code application logic here
    }
    
}
