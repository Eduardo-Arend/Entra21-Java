package SistemaEstudantil;

public abstract class Empregado extends Pessoa{
    private float salario;
    
    protected Empregado(String nome, String sobrenome, String cpf, float salario){
        super(nome, sobrenome, cpf);
        setSalario(salario);        
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

}
