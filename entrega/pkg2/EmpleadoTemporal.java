/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrega.pkg2;

/**
 *
 * @author MSI
 */
public class EmpleadoTemporal extends Empleado {
    private String tipo;
    private String usuario;
    private int contraseña;

    
    public EmpleadoTemporal(String tipo, String usuario, int contraseña,String nombre, int id) {
        super(nombre, id);
        this.tipo = tipo;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    
    public String getTipo() {
        return tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
}
