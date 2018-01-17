package exemploclasesobxectos;

/**
 *
 * @author ssahuquilloembade
 */
public class Pantalla {

    private String marca;
    private float pulgadas;

//Constructor por defecto    
    public Pantalla() {
    }
//Constructor por parámetros
    public Pantalla(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }
//Getters
    public String getMarca() {
        return marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }
//Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }
//ToString
    @Override
    public String toString() {
        return "Pantalla\n" + "marca=" + marca + "\npulgadas=" + pulgadas;
    }
    
    
}
