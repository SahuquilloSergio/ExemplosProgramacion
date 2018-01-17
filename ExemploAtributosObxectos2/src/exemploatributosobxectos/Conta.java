package exemploatributosobxectos;


public class Conta {
    private Persoas titular;
    private double saldo;
    private static float xuro = 0.04f;
    
    public Conta(){
        titular = new Persoas();
    }
    public Conta (String nom, String dn, double saldo){
        titular = new Persoas();
        titular.setNome(nom);
        titular.setDni(dn);
        this.saldo = saldo;
    }
    //Métodos de acceso
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    public double getSaldo (){
        return saldo;
    }
    public void setTitular (Persoas titular){
        this.titular = titular;
    }
    public Persoas getTitular (){
        return titular;
    }
    @Override
    public String toString(){
        return "titular ("+titular+"), saldo = "+saldo;
        //return "nome="+titular.getNome()+", dni="+titular.getDni()+", saldo="+saldo;
    }
    
    public double saldoFinal(){
        return saldo + saldo * xuro ;
    }

    public static double getXuro(){
        return xuro;
    }    
    
}
