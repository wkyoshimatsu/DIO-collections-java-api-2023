package set.Ordenacao.ListaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}

class ComparadorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}