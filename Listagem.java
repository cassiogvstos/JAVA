package javaapplication3;
import java.util.List;
import java.util.LinkedList;
public class Listagem{

    public static void main(String args[]){

        private List<Professor> professores = new LinkedList<>();
        private List<Aluno> alunos = new LinkedList<>();        
    }

    public void listarpessoa(Pessoa x){
        System.out.println("Nome do: "                        +x.getPessoa().getNome());
        System.out.println("CPF do: "                          +x.getPessoa().getCPF());
        System.out.println("RG do: "                            +x.getPessoa().getRG());
        System.out.println("Data de Nascimento do: "      +x.getPessoa().getDataNasc());
        System.out.println("Numero de Registro do: "+x.getProfessor()+x.getNRegistro());
    }

    public void listarpessoa(Pessoa x){
        System.out.println("Nome do: "                  +x.getPessoa().getNome());
        System.out.println("CPF do: "                    +x.getPessoa().getCPF());
        System.out.println("RG do: "                          +x.getRG().getRG());
        System.out.println("Data de Nascimento do: "+x.getPessoa().getDataNasc());
        System.out.println("Ra do: "                 +x.getPessoa().getRaaluno());
    }



}
