/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deportista;

/**
 *
 * @author pined
 */
public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Deporte: " + deporte);
    }
}