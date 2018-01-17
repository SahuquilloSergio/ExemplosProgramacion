
package dividir;


public class DividirSenExcepcion {
 private int numerador;
 private int denominador;

    public DividirSenExcepcion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
 
 public void dividirSenExcepcion(){
     int resposta = numerador/denominador;
     System.out.println(numerador+"/"+denominador+"="+resposta);
 }
 
 public void sumar(){
     System.out.println("suma="+(numerador+denominador));
 }
}
