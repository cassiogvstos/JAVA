package javaapplication3;
public class Professor extends Pessoa {
    public String numRegistro;
    
    public Professor(){
        System.out.println("\nProfessor Criado");
    }

    public void setNumRegistro  (String n){numRegistro    = n;}
    public String getNumRegistro(){return numRegistro;}
}