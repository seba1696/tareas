/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seba1
 */
public class tarea01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion();
    }

    public static void Operacion() {
        String x = null;
        String str = null;
        int i = 0;
        do {
            System.out.println("Escriba operacion deseada: ");
            str = Leer();
            Resultado(str);
            System.out.println("¿Realizar otra operacion 's'--'n'?.");
            x = Leer().toLowerCase();
        } while (x.charAt(i) != 'n');

    }

    public static void Resultado(String str) {
        int resultado = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') {
                System.out.println("" + Suma(str));
            } else {
                if (str.charAt(i) == '-') {
                    System.out.println("" + Resta(str));
                } else {
                    if (str.charAt(i) == '*') {
                        System.out.println("" + Multiplicacion(str));
                    } else {
                        if (str.charAt(i) == '/') {
                            System.out.println("" + Division(str));
                        }
                    }
                }
            }
        }
    }

    public static int Suma(String str) {
        String[] suma_string;
        int suma, a, b;
        suma_string = str.replaceAll(" ", "").split("\\+");
        a = Integer.parseInt(suma_string[0]);
        b = Integer.parseInt(suma_string[1]);
        suma = a + b;
        return suma;
    }

    public static int Resta(String str) {
        String[] resta_string;
        int resta, a, b;
        resta_string = str.replaceAll(" ", "").split("-");
        a = Integer.parseInt(resta_string[0]);
        b = Integer.parseInt(resta_string[1]);
        resta = (a - b);
        return resta;
    }

    public static int Multiplicacion(String str) {
        String[] multiplicacion_string;
        int multiplicacion, a, b;
        multiplicacion_string = str.replaceAll(" ", "").split("\\*");
        a = Integer.parseInt(multiplicacion_string[0]);
        b = Integer.parseInt(multiplicacion_string[1]);
        multiplicacion = a * b;
        return multiplicacion;
    }

    public static double Division(String str) {
        double division;
        String[] division_string;
        int a, b;
        division_string = str.replaceAll(" ", "").split("\\/");
        a = Integer.parseInt(division_string[0]);
        b = Integer.parseInt(division_string[1]);
        division = (double) a / b;
        return division;
    }

    public static String Leer() {
        String x = null;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try {
            x = leer.readLine();
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

}
