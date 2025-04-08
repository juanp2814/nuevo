/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrega.pkg2;

/**
 *
 * @author MSI
 */
public class Reporte {
    private static int numeroReportes=1;

    private String nombre;
    private String tipo;
    private int idReporte;

    
    public Reporte(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.idReporte = numeroReportes;
        numeroReportes++;
    }

   public Reporte() {
       
       this.idReporte = numeroReportes;
       this.nombre="";
       this.tipo="";
    
   }
    
    public long getIdReporte() {
        return idReporte;
    }

    
    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public void verTipoReporte() {
        System.out.println("El tipo de reporte es: " + tipo);
    }




}
