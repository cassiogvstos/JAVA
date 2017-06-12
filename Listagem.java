package javaapplication3;
import java.util.List;
import java.util.LinkedList;
public class Listagem{

    public static void main(String args[]){

        private List<Professor> professores = new LinkedList<>();
        private List<Aluno> alunos = new LinkedList<>();        
    }

    public void listarpessoa(Pessoa x){
        System.out.println("Nome: "              +x.getNome());
        System.out.println("CPF: "               +x.getCPF());
        System.out.println("RG: "                +x.getRG());
        System.out.println("Data de Nascimento: "+x.getDataNasc());
        System.out.println("\n");
    }

    public void listarAlunos(List<Alunos> alunos){
        System.out.println("Ra : " +a.getRaaluno());
        listarpessoa(a);
    }



}
