package exemplosbucles;
import java.util.Scanner;
public class BucleFor {
    Scanner sc = new Scanner(System.in);
//Declaramos el BucleFor
    public void calcularBucleFor(){
        int i=0, acuSum=0, acuProd=1, num;
        System.out.println("Teclea 7 numeros");
        for(i=0;i<7;i++){
            num = sc.nextInt();
            acuSum+=num;
            acuProd*=num;
        }
        System.out.println("Suma= "+acuSum);
        System.out.println("Producto= "+acuProd);
    }
    

}
