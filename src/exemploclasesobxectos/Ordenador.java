package exemploclasesobxectos;

/**
 *
 * @author ssahuquilloembade
 */
public class Ordenador {

    private Cpu procesador;
    private Pantalla pantalla;
    private Rato rato;
    
    public Ordenador(Cpu proce, Pantalla pantalla, Rato rato){
        procesador = proce;
        this.pantalla = pantalla;
        this.rato = rato;
    }
    
    public Ordenador(){
        procesador = new Cpu();
        pantalla = new Pantalla();
        rato = new Rato();
        
    }

    public Cpu getProcesador() {
        return procesador;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public Rato getRato() {
        return rato;
    }

    public void setProcesador(Cpu procesador) {
        this.procesador = procesador;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public void setRato(Rato rato) {
        this.rato = rato;
    }

    @Override
    public String toString() {
        return "Ordenador\n" + "procesador=" + procesador + "\npantalla=" + pantalla + "\nrato=" + rato;
    }
    
    
    
    
    
    
    

}
