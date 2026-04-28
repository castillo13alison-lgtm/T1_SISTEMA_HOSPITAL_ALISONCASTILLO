/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1_sistemahospital_alisoncastillo;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ControladorPaciente {
     private ArrayList<Paciente> listaPacientes = new ArrayList<>();

    public void agregarPaciente(Paciente p) {

        // Validar duplicados por documento
        for (Paciente paciente : listaPacientes) {
            if (paciente.getNumeroDocumento().equals(p.getNumeroDocumento())) {
                System.out.println("Paciente ya registrado.");
                return;
            }
        }

        listaPacientes.add(p);
        System.out.println("Paciente agregado correctamente.");
    }

    public void listarPacientes() {

        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (Paciente p : listaPacientes) {
                System.out.println(p.mostrarDatos());
                System.out.println("------------------------");
            }
        }
    }
    
}