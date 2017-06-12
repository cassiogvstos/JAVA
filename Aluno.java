package javaapplication3;
public class Aluno extends Pessoa{
    public String raAluno;
    
    public Aluno(){
        System.out.println("\nAluno Criado");
    }
    
    public void setRaAluno  (String r){raAluno    = r;}
    public String getRaAluno(){return raAluno;}    
}
