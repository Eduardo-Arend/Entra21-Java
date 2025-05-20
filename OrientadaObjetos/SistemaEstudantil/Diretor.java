package SistemaEstudantil;

public class Diretor extends Empregado{
    
    public Diretor(String nome, String sobrenome, String cpf, float salario){
        super(nome, sobrenome, cpf, salario);
        
    }
    public float calcularSalario(){
        return getSalario() + 1500;
    }
}
