package com.sergio.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import personas.Alumno;

public class LeerObxectos {
 Scanner sc;
    File fichero;
    ArrayList<Alumno> alum = new ArrayList();

    public void leerObjetos() {
        String linea;
        String[] lista = new String[2];
        Alumno al;
        try {
            sc = new Scanner(new File("C:\\Users\\serxa\\Desktop\\alumnos.txt"));

            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                lista = new String[2];
                lista = linea.split(",");
                al = new Alumno(lista[0], Integer.parseInt(lista[1]));
                System.out.println(al);

            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro1" + ex.getMessage());
        }
        sc.close();
    }

//    public void listaSuspensos() {
//        String linea;
//        String[] lista = new String[2];
//        
//        Alumno al;
//
//        try {
//            sc = new Scanner(new File("C:\\Users\\serxa\\Desktop\\alumnos.txt"));
//
//            while (sc.hasNextLine()) {
//                linea = sc.nextLine();
//                lista = new String[2];
//                lista = linea.split(",");
//
//                al = new Alumno(lista[0], Integer.parseInt(lista[1]));
//                if (Integer.parseInt(lista[1])<5) {
//                    
//                }
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("erro1" + ex.getMessage());
//        }
//        sc.close();
//    }   
}
