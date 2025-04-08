/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrega.pkg2;


       

import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados = new ArrayList<>(); 
    public ArrayList<Departamento> departamentos = new ArrayList<>(); 

    public Departamento(ArrayList<Empleado> empleados, ArrayList<Departamento> departamentos) {
        this.empleados = empleados;
        this.departamentos = departamentos;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
  

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    
  
    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public Departamento buscarDepartamento (Departamento departamento) {
        for (Departamento dep : departamentos) {
            if (dep.getNombre().equals(departamento.getNombre())) {
                return dep;
            }
        }
        return null; 
    }

    public Empleado buscarEmpleado (Empleado empleado) {
        for (Empleado emp : empleados) {
            if (emp.getNombre().equals(empleado.getNombre())) {
                return emp;
            }
        }
        return null;
    }
    

    
    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
    
    public void mostrarDepartamentos() {
        for (Departamento departamento : departamentos) {
            System.out.println(departamento.getNombre());
        }
    }

    
    public int obtenerNumeroDeEmpleados() {
        return empleados.size();
    }

    
    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }
    
    
    public void eliminarDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    
    public void modificarDepartamento(String nombreActual, String nuevoNombre) {
        for (Departamento departamento : departamentos) {
            if (departamento.getNombre().equals(nombreActual)) {
                departamento.setNombre(nuevoNombre);
                break;
            
            }
        }
    }
    
    public Departamento buscarDepartamento(String nombre) {
        for (Departamento departamento : departamentos) {
            if (departamento.getNombre().equals(nombre)) {
                return departamento;
            }
        } 
        return null; 
    }

           
    public Empleado buscarEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        return null; 
    }
    

    private int buscarEmpleado (long id) {
        for (int i = 0; i < empleados.size(); i++) {
            Empleado emp = empleados.get(i);
            if (emp.getId() == id) {
                return i;
            }
        }
        return -1; 
    }


    public void modificarEmpleado(long id, String nuevoNombre) {

        int index = buscarEmpleado(id);
        if (index != -1) {
            Empleado emp = empleados.get(index);
            
            emp.setNombre("Nuevo Nombre"); 
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    public String MostrarEmpleado(){
        String empleadosString = "";
        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado emp = this.empleados.get(i).
            empleados +=emp.toString() + "\n";
        }
        return empleado;
    }

   











}