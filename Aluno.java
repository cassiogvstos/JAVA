package javaapplication3;
public class Aluno extends Pessoa{
    public String RaAluno;
    
    public Aluno(){
        System.out.println("\nAluno Criado");
    }
    
    public void getRaAluno  (String r){RaAluno    = r;}
    public String setRaAluno(String r){return RaAluno;}    
}
