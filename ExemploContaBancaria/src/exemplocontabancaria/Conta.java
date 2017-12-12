package exemplocontabancaria;
public class Conta {

//Atributos.
   private String numeroConta;
   private String nome;
   private double cartos;
//Constructor Por Defecto.
    public Conta(){
        }
//Constructor Por Parámetros.
    public Conta(String numeroConta, String nome, double cartos){
       
  }
//Metodos De Aceso para o numero de conta.
//Setters para numero de conta y saldo.
    public void setnumeroConta(String nC){
        numeroConta = nC;
    }
//Getters para conseguir el nombre.
    public String getnome(String n){
        return nome;
    }    
//
    public void setCartos(double cantidade){
            cartos  = cantidade;
    }
//Metodo que reciba cartos, os ingrese e mostre o saldo final.
    public double ingresar(double cantidade){
        cartos = cartos + cantidade;
        return cartos;
    }
//Metodo que reciba cartos, os retire e mostre o saldo final.
    public double retirar(double cantidade){
        cartos = cartos - cantidade;
        return cartos;
    }
   @Override
    public String toString(){
     return ("nome = " + nome + "   numeroConta = " + numeroConta + "  saldo = "+ cartos);
    }
    public void anularConta(){
        nome = "null";
        numeroConta = "null";
        cartos = 0.0;
    }
}

