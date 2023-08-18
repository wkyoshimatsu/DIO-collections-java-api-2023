package set.Pesquisa.ListaDeTarefas;

public class Tarefa {
    private String descricao;
    private boolean estaConcluida;

    public Tarefa(String descricao, boolean estaConcluida) {
        this.descricao = descricao;
        this.estaConcluida = estaConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstaConcluida() {
        return estaConcluida;
    }

    public void setEstaConcluida(boolean estaConcluida) {
        this.estaConcluida = estaConcluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", estaConcluida=" + estaConcluida +
                '}';
    }
}
