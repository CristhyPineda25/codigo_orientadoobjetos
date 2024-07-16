/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author pined
 */
// Superclase abstracta Persona
public abstract class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void mostrarProfesion();
}

// Subclase Doctor
public class Doctor extends Persona {
    private String especialidad;

    // Constructor
    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    // Métodos getter y setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarProfesion() {
        System.out.println("Soy Doctor, especializado en " + especialidad);
    }
}

// Subclase Deportista
public class Deportista extends Persona {
    private String deporte;

    // Constructor
    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    // Métodos getter y setter
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarProfesion() {
        System.out.println("Soy Deportista, practico " + deporte);
    }
}

// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        Persona doctor = new Doctor("Juan Perez", 45, "Cardiología");
        Persona deportista = new Deportista("Ana Gomez", 30, "Tenis");

        doctor.mostrarProfesion();
        deportista.mostrarProfesion();

        System.out.println("Nombre: " + doctor.getNombre() + ", Edad: " + doctor.getEdad());
        System.out.println("Nombre: " + deportista.getNombre() + ", Edad: " + deportista.getEdad());
    }
}
