package javaapplication3;
import java.util.List;
import java.util.LinkedList;

public class Listagem {
    private String Nome,DataNasc,CPF,RG;
    private List<Pessoa> pessoa;
    private String RaAluno;
    
    public Listagem(String c, String n){
        pessoa = new LinkedList<>();
     
    }
    
    public void setRegistro (String n){Registro = n;}
    public String getRegistro(){return Registro;}
    
    public void setRaAluno (String n){RaAluno = n;}
    public String getRaAluno (){return RaAluno;}
    
    public void addFila(Professor p, int q){
        pessoa.add(new Professor(p,q));
    }
    public void removepessoaessor(int idx){
        pessoa.remove(idx);
    }
    
    public void listarpessoa(){
        float total=0;
        for(Pessoa x: pessoa){
            System.out.println("Nome do: "+x.getPessoa().getNome());
            System.out.println("CPF do: "+x.getPessoa().getCPF());
            System.out.println("RG do: "+x.getPessoa().getRG());
            System.out.println("Data de Nascimento do: "+x.getPessoa().getDataNasc());
            System.out.println("Numero de Registro do: "+x.getProfessor()+x.getNRegistro());
            
            total += x.getNRegistro();
        }
        System.out.println("\nQuantidade de pessoaessores: " +total);
    }
}
    class Fila {
        private Professor pessoa;
        private int regist;
        
        public Fila(Professor pro, int q) {
            pessoa = pro;
            regist = q;
        }
        public void setProfessor(Professor pro){pessoa = pro;}
        public void setNRegistro(int q){regist = q;}
        
        public Professor getProfessor(){return pessoa;}
        public int getNRegistro(){return regist;}
}
