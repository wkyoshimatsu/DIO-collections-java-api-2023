package set.Ordenacao.CadastroProdutos;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new TreeSet<Produto>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        this.produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<Produto>(this.produtosSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<Produto>(new ComparadorPreco());
        produtosPorPreco.addAll(this.produtosSet);
        return produtosPorPreco;
    }
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtosSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

