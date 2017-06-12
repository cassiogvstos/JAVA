package javaapplication3.JAVA;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import javaapplication3.Aluno;
import javaapplication3.Professor;
public class Listagem{

    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int op =0;
        private List<Professor> professores = new LinkedList<>();
        private List<Aluno> alunos = new LinkedList<>();
        private List<Turma> turmas = new LinkedList<>();

        do{
            System.out.println("Escolha uma das opções");
            System.out.println("1 – Cadastrar Professor");
            System.out.println("2 – Cadastrar Aluno");
            System.out.println("3 – Listar Professores");
            System.out.println("4 – Listar Alunos");
            System.out.println("5 – Gerenciar Turmas (outro menu)");
            System.out.println("6 – Listar Turmas (todos os dados)\n");
            System.out.println("7 – Sair");
            op = teclado.nextInt(); teclado.nextLine();
        }while(op != 7);
        
        if(op == 1){
            Professor p = new Professor();
            
            System.out.println("Digite o nome do professor: ");
            p.setNome(a);
            System.out.println("Digite o CPF do professor:  ");
            p.setCPF(a);
            System.out.println("Digite o RG do professor:   ");
            p.setRG(a);
            System.out.println("Digite a data de Nascimento do professor: ");
            p.setDataNasc(a);
            System.out.println("Digite o número de registro do professor: ");
            p.setNumRegistro(n);
        }
    }      
    public void listarpessoa(Pessoa x){
        System.out.println("Nome: "              +x.getNome());
        System.out.println("CPF: "               +x.getCPF());
        System.out.println("RG: "                +x.getRG());
        System.out.println("Data de Nascimento: "+x.getDataNasc());
        System.out.println("\n");
    }

    public void listarProfessor(List<Professor> professores){
        System.out.println("NumRegistro: " +p.getNumRegistro());
        listarpessoa(p);
    }

    public void listarAlunos(List<Alunos> alunos){
        System.out.println("Ra : " +a.getRaaluno());
        listarpessoa(a);
    }
    
    public void listarTurma(List<Turma> turmas){
        System.out.println("Pessoas na Turma: " +t.getNomeTurma());
        listarpessoa(t);
    }
}
