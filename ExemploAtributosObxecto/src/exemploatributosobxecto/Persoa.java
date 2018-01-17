
package exemploatributosobxecto;

public class Persoa {

private String nome;
private String dni;

//Constructor por defecto

public Persoa(){
}

//Constructor por parámetros

public Persoa(String nome, String dni){
    this.nome = nome;
    this.dni = dni;
}

//Setters Y Getters

public void setNome(String nome){
}

public void setDni(String dni){
}

public String getNome(){
    return nome;
}

public String getDni(){
    return dni;
}

@Override
public String toString(){
    return (nome    +  "dni :"  + dni);
    
}



}
