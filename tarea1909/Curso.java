/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seba1
 */
public class Curso {

    private ArrayList<Alumno> curso = new ArrayList<Alumno>();
    String nombre = null, apellido = null;
    int rut = 0, matricula =0;
    Alumno alu = new Alumno(nombre, apellido, rut, matricula);
    Alumno x = new Alumno();

    /**
     * Constructor for objects of class biblioteca
     */
    public Curso() {
    }

    public void Menu() {
        int n;
        System.out.println("=====================================");
        System.out.println("Bienvenido --- Curso Virtual");
        do {
            System.out.println("=====================================");
            System.out.println("1.Mostrar curso.");
            System.out.println("2.Agregrar alumno.");
            System.out.println("3.Eliminar alumno.");
            System.out.println("4.Buscar alumno.");
            System.out.println("5.Salir");
            System.out.println("=====================================");
            n = Leer();
            if (n < 1 || n > 5) {
                System.out.println("ERROR --- Opcion no valida.");
            } else {
                switch (n) {
                    case 1: {
                        mostrarCurso(curso);
                    }
                    break;
                    case 2: {
                        System.out.println("============================================");
                        System.out.print("Ingrese nombre del alumno: ");
                        String nombre = leerString();
                        System.out.print("Ingrese apellido del alumno: ");
                        String apellido = leerString();
                        System.out.print("Ingrese rut del alumno (sin puntos ni guion): ");
                        x.validarRut(rut = Leer());
                        System.out.print("Ingrese matricula del alumno: ");
                        int matricula = Leer();
                        agregarAlumno(this.getCurso(), nombre, apellido, rut, matricula);
                        System.out.println("============================================");
                    }
                    break;
                    case 3: {
                        System.out.println("============================================");
                        System.out.println("Ingrese nombre del alumno ha eliminar.");
                        String titulo = leerString();
                        eliminarAlumno(curso, titulo);
                        System.out.println("============================================");
                    }
                    break;
                    case 4: {
                        System.out.println("============================================");
                        System.out.println("Ingrese rut del alumno.");
                        x.validarRut(rut = Leer());
                        mostrarBusquedaLib(curso, rut);
                        System.out.println("============================================");
                    }
                    break;
                    case 5: {
                        System.out.println("Adios...");
                    }
                    break;
                }
            }
        } while (n != 5);
    }

    public ArrayList<Alumno> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<Alumno> curso) {
        this.curso = curso;
    }

    public void agregarAlumno(ArrayList<Alumno> alu, String nombre, String apellido, int rut, int matricula) {
        alu.add(new Alumno(nombre, apellido, rut, matricula));
    }

    public void eliminarAlumno(ArrayList<Alumno> alu, String nombre) {
        for (int i = 0; i < alu.size(); i++) {
            if (alu.get(i).getNombre().equals(nombre)) {
                alu.remove(i);
                break;
            }
        }
    }

    public void mostrarCurso(ArrayList<Alumno> alu) {
        for (Alumno al : alu) {
            al.mostrarAlumno();
        }
    }

    public boolean buscarAlumno(ArrayList<Alumno> alu, int rut) {
        boolean r = false;
        for (int i = 0; i < alu.size(); i++) {
            if (alu.get(i).getRut() == rut) {
                r = true;
                break;
            } else {
                r = false;
            }
        }
        return r;
    }

    public void mostrarBusquedaLib(ArrayList<Alumno> alu, int rut) {
        if (buscarAlumno(alu, rut)) {
            System.out.println("El alumno con rut: " + rut + ",se ecuentra en el curso\n");
        } else {
            System.out.println("El alumno con rut: " + rut + ",no se encuentra en el curso\n");
        }
    }

    public int Leer() {
        int n = 0;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(leer.readLine());
        } catch (Exception e) {
            System.out.println("Ingrese solo numeros.");
            System.out.println("=============================================");
        }
        return n;
    }

    public String leerString() {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String a = null;
        try {
            a = leer.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

}
