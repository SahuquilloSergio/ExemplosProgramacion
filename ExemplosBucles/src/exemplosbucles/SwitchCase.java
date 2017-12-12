package exemplosbucles;
import java.util.Scanner;
public class SwitchCase {
 Scanner sc = new Scanner(System.in);
 BucleWhile BC1 = new BucleWhile();
 BucleDoWhile BDW1 = new BucleDoWhile();
 BucleFor BF1 = new BucleFor();

 @Override
 public String toString(){
     return "***MENU***\n1-BucleWhile\n2-BucleDoWhile\n3-BucleFor\n\nElija la opcion deseada.";
     }
           
//Declaramos el Switch Case
 
 public void eleccion(){
     int op = sc.nextInt();
     
     switch(op){
         case 1: BC1.calcularWhile();
                 break;
         case 2: BDW1.calcularDoWhile();
                 break;
         case 3: BF1.calcularBucleFor();
                 break;
         default :System.out.println("Opción errónea, teclee unha das opciós propostas");
     }
    
}
 
 
 
 
}
