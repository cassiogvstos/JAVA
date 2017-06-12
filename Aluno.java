package javaapplication3;
public class Aluno extends Pessoa{
    public String RaAluno;
    
    public Aluno(){
        System.out.println("\nAluno Criado");
    }
    
    public void setRaAluno  (String r){RaAluno    = r;}
    public String getRaAluno(String r){return RaAluno;}    
}
