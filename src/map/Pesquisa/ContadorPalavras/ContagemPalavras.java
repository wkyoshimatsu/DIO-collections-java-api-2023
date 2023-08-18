package map.Pesquisa.ContadorPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<String, Integer>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagemPalavrasMap.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        if (!this.contagemPalavrasMap.isEmpty()){
            this.contagemPalavrasMap.remove(palavra);
        }
    }
    public int exibirContagemPalavras(){
        int contagem = 0;
        if (!this.contagemPalavrasMap.isEmpty()) {
            for (String palavra : this.contagemPalavrasMap.keySet()) {
                contagem += this.contagemPalavrasMap.get(palavra);
            }
        }
        return contagem;
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = "";
        if (!this.contagemPalavrasMap.isEmpty()){
            int contagemMaisFrequente = 0;
            for (String palavra : this.contagemPalavrasMap.keySet()){
                if (this.contagemPalavrasMap.get(palavra) > contagemMaisFrequente){
                    contagemMaisFrequente = this.contagemPalavrasMap.get(palavra);
                    palavraMaisFrequente = palavra;
                }
            }
        }
        return palavraMaisFrequente;
    }
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Palavra 1", 2);
        contagemPalavras.adicionarPalavra("Palavra 2", 8);
        contagemPalavras.adicionarPalavra("Palavra 3", 1);
        contagemPalavras.adicionarPalavra("Palavra 4", 6);
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");
        System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
