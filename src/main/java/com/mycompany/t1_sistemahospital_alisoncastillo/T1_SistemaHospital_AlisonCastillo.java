/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1_sistemahospital_alisoncastillo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class T1_SistemaHospital_AlisonCastillo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControladorPaciente controlador = new ControladorPaciente();
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Listar pacientes");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcion) {

                    case 1:
                        System.out.print("Primer nombre: ");
                        String pNombre = sc.nextLine();

                        System.out.print("Segundo nombre: ");
                        String sNombre = sc.nextLine();

                        System.out.print("Primer apellido: ");
                        String pApellido = sc.nextLine();

                        System.out.print("Segundo apellido: ");
                        String sApellido = sc.nextLine();

                        System.out.print("Tipo documento: ");
                        String tipoDoc = sc.nextLine();

                        // VALIDAR DNI
                        String numDoc;
                        while (true) {
                            System.out.print("Numero documento (8 digitos): ");
                            numDoc = sc.nextLine();
                            if (numDoc.matches("\\d{8}")) break;
                            System.out.println("DNI inválido");
                        }

                        // VALIDAR FECHA
                        String fecha;
                        while (true) {
                            System.out.print("Fecha nacimiento (dd/mm/aa): ");
                            fecha = sc.nextLine();
                            if (fecha.matches("\\d{2}/\\d{2}/\\d{2}")) break;
                            System.out.println("Formato incorrecto");
                        }

                        System.out.print("Tipo de sangre: ");
                        String sangre = sc.nextLine();

                        System.out.print("Alergias: ");
                        String alergias = sc.nextLine();

                        // VALIDAR TELEFONO
                        String telefono;
                        while (true) {
                            System.out.print("Telefono (9 digitos): ");
                            telefono = sc.nextLine();
                            if (telefono.matches("\\d{9}")) break;
                            System.out.println("Telefono inválido");
                        }

                        // VALIDAR CORREO
                        String correo;
                        while (true) {
                            System.out.print("Correo: ");
                            correo = sc.nextLine();
                            if (correo.contains("@") && correo.contains(".com")) break;
                            System.out.println("Correo inválido");
                        }

                        Paciente p = new Paciente(
                                pNombre, sNombre, pApellido, sApellido,
                                tipoDoc, numDoc, fecha, sangre,
                                alergias, telefono, correo
                        );

                        controlador.agregarPaciente(p);
                        break;

                    case 2:
                        controlador.listarPacientes();
                        break;

                    case 3:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opcion inválida");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 3);
    }
    }
    
