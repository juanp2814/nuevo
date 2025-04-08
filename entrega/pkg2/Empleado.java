/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrega.pkg2;

/**
 *
 * @author MSI
 */
public class Empleado {
    protected String nombre;
    private int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Empleado(String nombre, int id, String tipo, String usuario, int contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Empleado(String nombre, int id, String tipo, String usuario, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Empleado(String nombre, String id, String tipo, String usuario, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado{" + id + "\n" +
            "Nombre "+ nombre + "\n" +
                "id " + id + "\n" ;
            }


            
         
    

    public static Empleado crearEmpleado(String nombre, int id) {
        return new Empleado(nombre, id);
    }

    
    




   





}
