package SistemaEstudantil;


public class Turma {

    private String codigo;
    private byte cargaHoraria;
    private Professor professor;
    private Aluno [] alunos;
    private final static byte TAMANHO_TURMA= 25;
    private int quantidadeAlunos;

    public Turma(String codigo, byte cargaHoraria, Professor professor) {
        setCargaHoraria(cargaHoraria);
        setCodigo(codigo);
        setProfessor(professor);
        alunos = new Aluno[TAMANHO_TURMA];
        
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;

    }

    public byte getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(byte cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public boolean adicionarAluno (Aluno aluno){

        if (TAMANHO_TURMA == quantidadeAlunos) 
            return false;
        for(int i =0; i < TAMANHO_TURMA; i++)
            if (alunos[i].getCPF().equals(aluno.getCPF())) {
                return false;
            }

            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;


        return true;
    }

    public boolean removerAluno(){
        if (quantidadeAlunos == 0) {
            return false;

    

            for(int i =0; i < TAMANHO_TURMA; i++)

            if (alunos[i].getCPF().equals(alunosluno.getCPF())) {
                alunos[i]= null;
                alunos = reorganizarVetor(alunos);
                quantidadeAlunos--;
                return true;
            }
        
        }
        return false;
    }
    
    private Aluno[] reorganizarVetor(Aluno[] alunos){

        return null;
    }
}