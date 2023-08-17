package list.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);

    }
    public Integer calcularSoma() {
        int soma = 0;
        if(!this.numeros.isEmpty()){
            for(Integer i : this.numeros){
                soma += i.intValue();
            }
        }
        return soma;
    }
    public Integer encontrarMaiorNumero() {
        Integer maior = null;
        if(!this.numeros.isEmpty()){
            maior = numeros.get(0);
            for(Integer i : this.numeros){
                if (i > maior){
                    maior = i;
                }
            }
        }
        return maior;
    }
    public Integer encontrarMenorNumero(){
        Integer menor = null;
        if(!this.numeros.isEmpty()){
            menor = numeros.get(0);
            for(Integer i : this.numeros){
                if (i < menor){
                    menor = i;
                }
            }
        }
        return menor;
    }
    public void exibirNumeros() {
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        SomaNumeros listaNumeros = new SomaNumeros();
        listaNumeros.exibirNumeros();
        listaNumeros.adicionarNumero(1);
        listaNumeros.adicionarNumero(2);
        listaNumeros.adicionarNumero(-1);
        listaNumeros.adicionarNumero(-2);
        listaNumeros.adicionarNumero(3);
        listaNumeros.adicionarNumero(-4);
        System.out.println(listaNumeros.calcularSoma());
        System.out.println(listaNumeros.encontrarMaiorNumero());
        System.out.println(listaNumeros.encontrarMenorNumero());
        listaNumeros.exibirNumeros();
    }
}
