package exemplometodos;
import java.util.Scanner;
public class Rectangulo {
    private float base;
    private float altura;
    
//Constructores 
//Constructor por defecto
    public Rectangulo(){
    
    }
//Constructor con parámetros
    public Rectangulo (float ba, float alt){
        base = ba;
        altura = alt;
    }
 
//Metodos de Acceso
//Setters  
    public void setBase (float ba){
        base = ba;
    }
   
    public void setAltura (float alt){
        altura = alt;
    }
//Getters
    public float getBase(){
        return base;
    }
 
    public float getAltura(){
        return altura;
 
   }    
//Amosamos
   public void amosar(){
       System.out.println("Base= " + base + "Altura =" + altura);
   }
//Calculamos Area
   public void calcularArea(float ba, float alt){
       Scanner sc = new Scanner(System.in);
       float area = ba * alt;
       System.out.println("area = " + area);
               
   }
//Calculamos Perimetro  
   public float calcularPerimetro(float ba, float alt){
   float perimetro = 2 * ba + 2 * alt;
   return perimetro;
   
   }
   //metodo que no va mostrar nada y devuelve un string
   
   public String visualizar(){
       return ("valor de la base = "+ base + "valor de la altura= " + altura);
       
   }//asdas
}
