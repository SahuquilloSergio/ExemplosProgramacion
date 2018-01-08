package exemploclasesobxectos;

/**
 *
 * @author ssahuquilloembade
 */
public class Rato {

    private String tipo;

//Constructor por defecto    
    public Rato() {
    }
//Constructor por parámetros
    public Rato(String tipo) {
        this.tipo = tipo;
    }
//Getters
    public String getTipo() {
        return tipo;
    }
//Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
//ToString
    @Override
    public String toString() {
        return "Rato\n" + "tipo=" + tipo;
    }
    
    
}
