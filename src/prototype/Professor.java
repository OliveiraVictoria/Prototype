package prototype;

public class Professor implements Cloneable {
    private int matricula;
    private String nome;
    private Escola escola;
    private String formacao;

    public Professor(int matricula, String nome, Escola escola, String formacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.escola = escola;
        this.formacao = formacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public Professor clone() throws CloneNotSupportedException {
        Professor ProfessorClone = (Professor) super.clone();
        ProfessorClone.escola = (Escola) ProfessorClone.escola.clone();
        return ProfessorClone;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", escola=" + escola +
                ", Formacao='" + formacao + '\'' +
                '}';
    }
}