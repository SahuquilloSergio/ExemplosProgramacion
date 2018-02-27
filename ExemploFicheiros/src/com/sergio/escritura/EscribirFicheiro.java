package com.sergio.escritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFicheiro {
 
    File fich;
    PrintWriter escribir;
    
    public void escribirFrases(){
        try{
            fich = new File("C:\\Users\\serxa\\Desktop\\frases.txt");
            escribir = new PrintWriter(fich);
            
            escribir.println("primeira frase");
            escribir.println("segunda frase");
            escribir.println("terceira frase");
            
            
        }catch(FileNotFoundException ex){
            System.out.println("archivo no encontrado");
        }catch(IOException ex){
            System.out.println("erro4");
        }finally{
            escribir.close();
        }
    }   
}
