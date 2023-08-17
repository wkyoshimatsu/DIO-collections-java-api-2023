package set.Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<Contato>();
    }
    public void adicionarContato(String nome, int numero){
        agendaContatos.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(agendaContatos);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<Contato>();
        if(!this.agendaContatos.isEmpty()){
            for(Contato contato : this.agendaContatos){
                if(contato.getNome().startsWith(nome)){
                    contatosPorNome.add(contato);
                }
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if(!this.agendaContatos.isEmpty()){
            for (Contato c : agendaContatos){
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setTelefone(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));

        agendaContatos.exibirContatos();
    }
}
