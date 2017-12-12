
package exemplometodos;

import java.util.Scanner;


public class ExemploMetodos {
   
   
    public static void main(String[] args) {
 
        Rectangulo rec1 = new Rectangulo();
        Scanner ler = new Scanner(System.in);
        rec1.amosar();
        System.out.println("Escribe Base");
        float base = ler.nextFloat();
        System.out.println("Escribe Altura");
        float altura = ler.nextFloat();
        
        Rectangulo rec2 = new Rectangulo(base, altura);
        rec2.amosar();
        //float pe = rec2.calcularPerimetro(base, altura);     
        System.out.println("perimetro =" + rec2.calcularPerimetro(base, altura));
        rec2.setBase(10f);
        float valorAltura = rec2.getAltura();
        System.out.println("Altura Rectangulo = " + valorAltura);
   
    }
    
        
        
      
       

    
}
