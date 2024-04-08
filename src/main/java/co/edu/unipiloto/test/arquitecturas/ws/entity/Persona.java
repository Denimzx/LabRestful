/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.test.arquitecturas.ws.entity;

/**
 *
 * @author Sebastian
 */
public class Persona {
    private int id;
    private String nombreCompleto;
    private int Edad;
    private Sueldo salario; 
    public static final int SalarioMinimo = 1300000;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the salary
     */
    public Sueldo getSalario() {
        return salario;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalario(int salario) {
        this.salario = new Sueldo();
        this.salario.setSueldo(salario);
    }
}
