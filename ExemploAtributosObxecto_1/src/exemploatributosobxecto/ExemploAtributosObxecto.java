package exemploatributosobxecto;

public class ExemploAtributosObxecto {

    public static void main(String[] args) {
        Persoa persoas1 = new Persoa("ds","4353f");
        Conta obxConta = new Conta("millonetis","11111111", 1000000);
        obxConta.setTitular(persoas1);
        System.out.println(obxConta.toString());
        Persoa obxPersoa = new Persoa("bbbbb","22222");
        Conta obxConta2 = new Conta(obxPersoa,555555.0);
        System.out.println("conta2 : "+ obxConta2.toString());
    
    
    
    }
    
    
    
}
