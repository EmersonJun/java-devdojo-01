import java.util.Arrays;

public class Seminario {
    private String titulo;
    private Aluno[] aluno;
    private Local local;
    private Professor professor;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] aluno, Local local, Professor professor) {
        this.titulo = titulo;
        this.aluno = aluno;
        this.local = local;
        this.professor = professor;
    }
    public void imprime(){
        System.out.println(this.titulo);
        System.out.println("\n");
        System.out.println(Arrays.toString(aluno));
        System.out.println("\n");
        System.out.println(this.getLocal());
        System.out.println("\n");
        System.out.println(this.getProfessor());
    }

    public String getTitulo() {
        return titulo;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Seminario [titulo=" + titulo + ", aluno=" + Arrays.toString(aluno) + ", local=" + local + ", professor="
                + professor + "]";
    }
    
}
