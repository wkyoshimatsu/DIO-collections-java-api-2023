package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<Item>();
        for(Item item : carrinho){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        this.carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item item : carrinho){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }
    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.exibirItens();
        carrinho.adicionarItem("Item1", 2.50, 2);
        carrinho.adicionarItem("Item2", 3.45, 51);
        carrinho.adicionarItem("Item2", 3.45, 51);

        carrinho.exibirItens();

        System.out.println(carrinho.calcularValorTotal());

        carrinho.removerItem("item2");

        carrinho.exibirItens();
    }
}
