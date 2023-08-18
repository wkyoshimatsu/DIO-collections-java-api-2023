package set.Ordenacao.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;
    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media) {
        this.alunosSet.add(new Aluno(nome, matricula, media));
    }
    public void removerAlunoPorMatricula(Long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno aluno : this.alunosSet) {
            if (aluno.getMatricula() == matricula) {
                alunoParaRemover = aluno;
                break;
            }
        }
        this.alunosSet.remove(alunoParaRemover);
    }
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosOrdenadosPorNome = new TreeSet<>(alunosSet);
        return alunosOrdenadosPorNome;
    }
    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosOrdenadosPorNota = new TreeSet<>(new ComparadorNota());
        alunosOrdenadosPorNota.addAll(alunosSet);
        return alunosOrdenadosPorNota;
    }
    public void exibirAlunos(){
        System.out.println(alunosSet);
    }
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 1", 123456l, 6d);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 1234567l, 8d);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 12345678l, 1d);
        gerenciadorAlunos.adicionarAluno("Aluno 4", 123456789l, 9d);
        System.out.println(gerenciadorAlunos.alunosSet);

        gerenciadorAlunos.removerAlunoPorMatricula(000l);
        gerenciadorAlunos.removerAlunoPorMatricula(123456789l);
        System.out.println(gerenciadorAlunos.alunosSet);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
