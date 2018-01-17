package exemplosbucles;
import java.util.Scanner;
public class BucleDoWhile {
    Scanner sc = new Scanner(System.in);
    //Declaramos metodo Do While
    public void calcularDoWhile(){
    int i=0, acuSuma=0, acuProd=1;
        do{
           //Pedimos el numero por teclado
           System.out.println("Inserte el valor del numero");
            int num=sc.nextInt();
           //Hacemos las operaciones e incrementamos el contador
            acuSuma=acuSuma+num;
            acuProd=acuProd*num;
            i++;
            //Declaramos la condicion while
       }while(i<7);
    //Mostramos por pantalla los resultados de las operaciones
    System.out.println("Suma= "+acuSuma);
    System.out.println("Producto= "+acuProd);
}
}