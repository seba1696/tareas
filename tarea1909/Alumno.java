/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcurso;

/**
 *
 * @author seba1
 */
public class Alumno {

    private String nombre, apellido;
    private int rut,matricula;

    Alumno() {
    }

    Alumno(String nombre, String apellido, int rut, int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.matricula = matricula;
    }

    public void mostrarAlumno() {
        String msj = "" + this.nombre + "\t" + this.apellido + "\t" + this.rut + "\t" + this.matricula;
        System.out.println(msj);
    }

    public String validarRut(int rut) {
        String n = null;
        boolean y = false;
        do {
            if (rut <= 8) {
                System.out.println("Rut no valido.");
                y = false;
            } else {
                n = String.valueOf(rut);
                y = true;
            }
        } while (y == false);
        return n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
