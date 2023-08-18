package map.Pesquisa.EstoqueProdutosComPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<Long, Produto>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        this.estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos(){
        System.out.println(this.estoqueProdutosMap);
    }
    public Double calcularValorTotalEstoque(){
        Double valorTotal = 0.0;
        if (!this.estoqueProdutosMap.isEmpty()){
            for (Produto produto : this.estoqueProdutosMap.values()) {
                valorTotal += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotal;
    }
    public Produto obterProdutoMaisCaro(){
        Produto maisCaro = null;
        if (!this.estoqueProdutosMap.isEmpty()){
            for (Produto produto : this.estoqueProdutosMap.values()) {
                if (maisCaro == null || maisCaro.getPreco() < produto.getPreco()) {
                    maisCaro = produto;
                }
            }
        }
        return maisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto maisBarato = null;
        if (!this.estoqueProdutosMap.isEmpty()){
            for (Produto produto : this.estoqueProdutosMap.values()) {
                if (maisBarato == null || maisBarato.getPreco() > produto.getPreco()) {
                    maisBarato = produto;
                }
            }
        }
        return maisBarato;
    }
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto maiorQuantidadeValorTotalNoEstoque = null;
        if (!this.estoqueProdutosMap.isEmpty()){
            for (Produto produto : this.estoqueProdutosMap.values()) {
                if (maiorQuantidadeValorTotalNoEstoque == null || maiorQuantidadeValorTotalNoEstoque.getQuantidade() * maiorQuantidadeValorTotalNoEstoque.getPreco()
                        < produto.getQuantidade() * produto.getPreco()) {
                    maiorQuantidadeValorTotalNoEstoque = produto;
                }
            }
        }
        return maiorQuantidadeValorTotalNoEstoque;
    }
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 1, 50.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 11.0);
        estoque.adicionarProduto(3L, "Produto C", 3, 10.0);
        estoque.adicionarProduto(3L, "Produto D", 2, 4.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto com maior quantidade em valor no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
