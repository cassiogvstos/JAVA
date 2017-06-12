package javaapplication3;
public class Professor extends Pessoa {
    public String NumRegistro;
    
    public Professor(){
        System.out.println("\nProfessor Criado");
    }

    public void setNumRegistro  (String n){NumRegistro    = n;}
    public String getNumRegistro(String n){return NumRegistro;}
}