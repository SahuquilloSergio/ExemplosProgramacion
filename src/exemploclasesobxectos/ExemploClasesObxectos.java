package exemploclasesobxectos;

/**
 * @author ssahuquilloembade
 */
public class ExemploClasesObxectos {

    public static void main(String[] args) {
        
        Cpu c = new Cpu(2000,1000);
        Pantalla p = new Pantalla("Philips", 15.5f);
        Rato r = new Rato("con cable");
        Ordenador O1 = new Ordenador(c,p,r);
//        System.out.println(O1.toString());
        
        Ordenador O2 = new Ordenador(new Cpu(2500,2000), new Pantalla("Samsung", 15.5f),new Rato("con cables"));
    
        c.setVelocidade(5000);
        O1.getProcesador().setVelocidade(5000);
        //System.out.println(O1.toString());
    
        //System.out.println(O2.getPantalla().getMarca());
        
        Ordenador O3 = new Ordenador();
        System.out.println(O3);
        O3.getProcesador().setVelocidade(3000);
        O3.getProcesador().setMemoria(1500);
        O3.getPantalla().setMarca("Asus");
        O3.getPantalla().setPulgadas(13.2f);
        O3.getRato().setTipo("sen cables");
        System.out.println(O3);
        
    
    }
    
    
    
}
