package exemploatributosobxecto;

public class Conta {
       private Persoa titular = new Persoa();
       private double saldo;
       
       public Conta(){
           
        }
       public Conta(Persoa ti, double saldo){
           titular = ti;
           this.saldo = saldo;
       }
       public Conta(String nome, String dni, double saldo){
           titular = new Persoa();
           titular.setNome(nome);
           titular.setDni(dni);
           this.saldo = saldo;
       }
       //Metodos de Acceso
       public String getNome(){
           return titular.getNome();
       }
       public String getDni(){
           return titular.getDni();
       }
       public double getSaldo(){
           return saldo;
       }
       
       public void setTitular(Persoa titular){
           this.titular = titular;
       }
       public Persoa getTitular(){
           return titular;
       }
       
       @Override
       public String toString(){
           return(titular +", saldo da conta = " + saldo);
       }

}





