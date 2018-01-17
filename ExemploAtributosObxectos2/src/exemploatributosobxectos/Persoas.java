/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploatributosobxectos;

/**
 *
 * @author abrandarizdominguez
 */
public class Persoas {
    private String nome;
    private String dni;
    //Constructor por defecto
    public Persoas(){
    }
    //Constructor con parámetros
    public Persoas(String nome, String dni){
        this.nome=nome;
        this.dni=dni;
    }
    //Métodos de acceso
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
    public String getDni(){
        return dni;
    }
    @Override
    public String toString(){
        return "nome = "+nome+", dni = "+dni;
    }
}