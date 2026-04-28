/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1_sistemahospital_alisoncastillo;

/**
 *
 * @author HP
 */
public class Paciente {
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String tipoDocumento;
    private String numeroDocumento;
    private String fechaNacimiento;
    private String tipoSangre;
    private String alergias;
    private String telefono;
    private String correo;

    public Paciente(String primerNombre, String segundoNombre,
                    String primerApellido, String segundoApellido,
                    String tipoDocumento, String numeroDocumento,
                    String fechaNacimiento, String tipoSangre,
                    String alergias, String telefono, String correo) {

        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.alergias = alergias;
        this.telefono = telefono;
        this.correo = correo;
    }

    
    public boolean validarDocumento() {
        return numeroDocumento.length() >= 8;
    }

    public boolean validarTelefono() {
        return telefono.length() == 9;
    }

    public boolean validarCorreo() {
        return correo.contains("@") && correo.contains(".com");
    }

    public boolean validarDatosObligatorios() {
        return !tipoSangre.isEmpty() && !alergias.isEmpty();
    }

    public String obtenerNombreCompleto() {
        return primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido;
    }

    public String mostrarDatos() {
    return "Nombre: " + obtenerNombreCompleto() + "\n"
            + "Documento: " + numeroDocumento + "\n"
            + "Fecha nacimiento: " + fechaNacimiento + "\n"
            + "Telefono: " + telefono + "\n"
            + "Correo: " + correo + "\n"
            + "Tipo de sangre: " + tipoSangre + "\n"
            + "Alergias: " + alergias;
}

    public String mostrarAlertaMedica() {
        return "Sangre: " + tipoSangre + " | Alergias: " + alergias;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public boolean validarFecha() {
    return fechaNacimiento.matches("\\d{2}/\\d{2}/\\d{2}");
}
}
