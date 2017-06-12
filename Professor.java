package javaapplication3;
public class Professor extends Pessoa {
    public String NumRegistro;
    
    public Professor(){
        System.out.println("\nProfessor Criado");
    }

    public void getNumRegistro  (String n){NumRegistro    = n;}
    public String setNumRegistro(String n){return NumRegistro;}
}