package exemplosbucles;
import java.util.Scanner;
public class BucleWhile {
//Declaramos el Bucle While
    public void calcularWhile(){
        int i=0, acuSuma=0, acuProducto=1;
        Scanner sc = new Scanner(System.in);
        while (i<7){
            System.out.println("Introduzca el valor del numero");
            int num=sc.nextInt();
            acuSuma=acuSuma + num;
            acuProducto=acuProducto * num;
            i++;
            }
            System.out.println("suma= "+acuSuma);
            System.out.println("producto= "+acuProducto);
    }
    
    
    
    
}
