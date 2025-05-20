package SistemaEstudantil;
public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String sobrenome;

    protected Pessoa(String nome, String sobrenome, String cpf){
        super();
        setCPF(cpf);
        setNome(nome);
        setSobreNome(sobrenome);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCPF(){
        return cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getSobreNome(){
        return sobrenome;
    }
    public void setSobreNome (String sobrenome){
        this.sobrenome = sobrenome;
    }
}
