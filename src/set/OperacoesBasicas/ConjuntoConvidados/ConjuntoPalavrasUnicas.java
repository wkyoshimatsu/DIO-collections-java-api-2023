package set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;
    //Método que adiciona uma palavra ao conjunto.

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavrasSet.add(palavra);
    }
    //Método que remove uma palavra do conjunto.
    public void removerPalavra(String palavra){
        this.palavrasSet.remove(palavra);

    }
    //Método que verifica se uma palavra está presente no conjunto.
    public boolean verificarPalavra(String palavra){
        return this.palavrasSet.contains(palavra);
    }
    //Método que exibe todas as palavras únicas do conjunto.
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 2");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 5");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Palavra 2"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
