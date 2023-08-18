package set.Pesquisa.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefasSet.add(tarefa);
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!this.tarefasSet.isEmpty()){
            for (Tarefa tarefa : this.tarefasSet){
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = tarefa;
                    break;
                }
            }
            this.tarefasSet.remove(tarefaParaRemover);
        }
    }
    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }
    public int contarTarefas(){
        return this.tarefasSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!this.tarefasSet.isEmpty()){
            for (Tarefa t : this.tarefasSet){
                if (t.isEstaConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!this.tarefasSet.isEmpty()){
            for (Tarefa t : this.tarefasSet){
                if (!t.isEstaConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        if (!this.tarefasSet.isEmpty()){
            for (Tarefa t : this.tarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setEstaConcluida(true);
                    break;
                }
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        if (!this.tarefasSet.isEmpty()){
            for (Tarefa t : this.tarefasSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setEstaConcluida(false);
                    break;
                }
            }
        }
    }
    public void limparListaTarefas(){
        this.tarefasSet.clear();
    }
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 1", false));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 2", false));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 3", false));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 4", false));
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Tarefa 55");
        listaTarefas.exibirTarefas();

        System.out.println("Existem " + listaTarefas.contarTarefas() + " na lista de tarefas.");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.exibirTarefas();
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
