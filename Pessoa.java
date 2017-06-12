package javaapplication3;
public abstract class Pessoa {
    private String Nome,DataNasc,CPF,RG;
    
    public Pessoa(){
        System.out.println("\nPessoa Criada");
    }
    
    public void setNome    (String a){Nome     = a;}
    public void setDataNasc(String a){DataNasc = a;}
    public void setCPF     (String a){CPF      = a;}
    public void setRG      (String a){RG       = a;}
    
    public String getNome    (){return     Nome;}
    public String getDataNasc(){return DataNasc;}
    public String getCPF     (){return      CPF;}
    public String getRG      (){return       RG;} 

}