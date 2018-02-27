package com.sergio.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerFicheiro {
     Scanner sc;
    File ficheiro;
    
    public void leerLineas(){
    String resposta = null;
    ficheiro = new File("C:\\Users\\serxa\\Desktop\\primero.txt");
//    ficheiro= new File ("segundo.txt");
        try {
            sc= new Scanner(ficheiro);
            while(sc.hasNextLine()){
//              resposta = sc.nextLine();
//              System.out.println(resposta);
            System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("erro1"+ex.getMessage());
        }
        sc.close();
    }   
}
