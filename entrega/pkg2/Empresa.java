/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrega.pkg2;


public class Empresa {
    private String nombre;

    
    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }

               
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDepartamento(Departamento departamento) {
        return this.departamento.verDepartamentos(departamento);
        
    }

    public Empleado verEmpleado(Empleado empleado) {
        return this.departamento.verEmpleados(empleado);
        
    }

    public Reporte verReporte(Reporte reporte) {
        return this.departamento.verReportes(reporte);
        
    }
    public Empleado agregarEmpleado(Empleado empleado) {
        return this.departamento.agregarEmpleados(empleado);
        
    }
    public Departamento agregarDepartamento(Departamento departamento) {
        return this.departamento.agregarDepartamentos(departamento); 
        
    }

    public String verTipoReporte(Reporte reporte) {
        return this.reporte.verTipoReporte(reporte); 
        
    }
    
    public Empleado eliminarDepartamento (String nombre) {
        return this.departamento.eliminarDepartamentos(nombre); 
       
    }
    public Empleado eliminarEmpleado (String nombre) {
        return this.departamento.eliminarEmpleados(nombre); 
        
    }  
    
    public boolean iniciarSesion(String usuario, int contraseña) {
        this.usuario.getUsuario().equals(usuario);
        this.contraseña.getContraseña().equals(contraseña);
        return true;
        System.out.println("Usuario correcto");

    }else {
        
    
        
        return false;
        System.out.println("Usuario o contraseña incorrectos");
    }


    




}