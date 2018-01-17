package exemplocontabancaria;
import java.util.Scanner;
public class ExemploContaBancaria {

/*Codifica un programa para xestionar unha conta bancaria. Para iso
  crea unha clase conta con 3 atributos: nome, nºconta e saldo(double).
  Constructores por defecto y con parametros.
  Metodo de acceso para o numero de conta, metodo para recibir o nome da conta
  e para mudar o saldo.
  Metodo que reciba unha cantidade de cartos e os ingrese na nosa conta e
  devolva o saldo final(double)
  Metodo que reciba unha cantidade de cartos e os retire da nosa conta,
  devolvendo o saldo final(ainda que non teña os cartos na conta o banco daria
  os cartos quedando o saldo negativo).
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta libreta1 = new Conta();
        System.out.println(libreta1.toString());
        libreta1.setCartos(6000000);
        libreta1.setnumeroConta("11111");
        System.out.println(libreta1.toString());
        
        Conta libreta2 = new Conta();
        libreta2.setnumeroConta("22222");
        libreta2.setCartos(5000);
        System.out.println(libreta2.toString());
        libreta2.setnumeroConta("12345");
        System.out.println(libreta2.toString());
        String nome = sc.nextLine();//Lee tambien los espacios en blanco
        System.out.println(" numero de conta :");
        String numeroConta = sc.next();//Lee hasta el primer espacio en blanco
        System.out.println(" cartos :");
        double cartos = sc.nextDouble();
        
        Conta libreta3 = new Conta("numeroConta", "nome", cartos);
        libreta3.ingresar(3000);
        System.out.println(libreta3.toString());
        System.out.println("total= " + libreta3.ingresar(3000));
        System.out.println("total= " + libreta3.retirar(700000));
        libreta3.anularConta();
        System.out.println("total= " + libreta3.toString());
        
        
        

        
        
        
    }
    
}
