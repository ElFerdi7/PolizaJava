/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliza;

import java.util.ArrayList;

/**
 *
 * @author a022583952e
 */
public class Persona {

    /**
     * Variables
     */
    private String nombre, direccion, dni;
    private int edad;
    ArrayList<Contrato>contratos=new ArrayList<Contrato>();
    private Persona casadocon;
    
    public Persona getCasadocon() {
        return casadocon;
    }

    public void setCasadocon(Persona casadocon) {
        this.casadocon = casadocon;
    }

    /**
     *
     * @return
     */
   
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    public String getDni() {
        return dni;
    }

    /**
     *
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @param nombre
     * @param direccion
     * @param dni
     * @param edad
     */
    public Persona(String nombre, String direccion, String dni, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.edad = edad;
        
    }

}
