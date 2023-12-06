/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.regalo.entities;

/**
 *
 * @author PC
 */
public class Hall {
    
    private int Sala_id;
    private String nombre;
    private String capacidad;

    public Hall(int Sala_id, String nombre, String capacidad) {
        this.Sala_id = Sala_id;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public Hall() {
    }

    public int getSala_id() {
        return Sala_id;
    }

    public void setSala_id(int Sala_id) {
        this.Sala_id = Sala_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Hall findByID(int sala_id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
