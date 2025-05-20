package SistemaEstudantil;

public class Professor extends Empregado {

   private Turma turma;

   public Professor(String nome, String sobrenome, String cpf, float salario) {
      super(nome, sobrenome, cpf,salario );
   }

   public Professor(String nome, String sobrenome, String cpf, Turma turma, float salario) {
      super(cpf, nome, sobrenome, salario);
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

   public void efetuarChamada() {
      System.out.println("Pessoal, vamos fazer a chamada:");
   }
}
