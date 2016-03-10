package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    private static Scanner x;

    public static void main(String[] args) throws Exception {

        String opcion = "s";
        int Curso;
        int C1 = 0;
        int C2 = 0;
        int C3 = 0;
        String nombre;
        String apellido;
        String cedula;
        String telefono;
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        while (opcion.equals("S") || opcion.equals("s")) {
        System.out.println("CENTRO EDUCATIVO ABC");
        System.out.println("Que curso desea matricuarse");
        System.out.println("1 para Programacion C++ \n2 para Programacion en Python \n3 para Programacion en Java");
        x = new Scanner(System.in);
        Curso = x.nextInt();

        switch (Curso) {
            case 1:
                System.out.println("Clase de Programacion C++");
                C1 = C1+1;
                break;
            case 2:
                System.out.println("Clase de Programacion Python");
                C2 = C2+1;
                break;
            case 3:
                System.out.println("Clase de Programacion Java");
                C3 = C3+1;
                break;
        }

        System.out.print("Ingrese su nombre:");
        nombre = x.next();
        System.out.print("Ingrese su apellido:");
        apellido = x.next();
        System.out.print("Ingrese su cedula:");
        cedula = x.next();
        System.out.print("Ingrese su Numero de telefono:");
        telefono = x.next();

        System.out.println("Personas matriculadas en"+"\n\nCurso de C++: "+C1+"\n\nCurso de Python: "+C2+"\n\nCurso de Java: "+C3);

            System.out.print("Desea continuar (S/N): ");
            opcion = n.readLine();
        }




    }
}
