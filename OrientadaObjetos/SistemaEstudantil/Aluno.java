package SistemaEstudantil;

public class Aluno extends Pessoa {
    private Turma turma;

    public Aluno(String nome, String sobrenome, String cpf) {
        super(cpf, nome, sobrenome);
    }

    public Aluno(String nome, String sobrenome, String cpf, Turma turma) {
        super(cpf, nome, sobrenome);
        setCPF(cpf);
        setNome(nome);
        setSobreNome(sobrenome);
        setTurma(turma);
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void responderChamada(){
        System.out.println(getNome()+" está presente.");
    }
}
