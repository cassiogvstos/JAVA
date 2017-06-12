package javaapplication3.JAVA;

public class Turma {
    private Professor professor;
    private String nomeTurma;
    
    public Turma(Professor p){
        p = professor;
    }
    public void setNomeTurma (String t){nomeTurma = t;}
    public String getNomeTurma (){return nomeTurma;}
}
